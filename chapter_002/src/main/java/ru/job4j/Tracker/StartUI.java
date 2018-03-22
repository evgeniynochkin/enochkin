package ru.job4j.tracker;

import java.util.Date;

/**
* Основной класс Trackera.
*
* @author Evgeniy Nochkin
* @since 20.03.2018
*/

public class StartUI {
	private static final String ADD = "0";
	private static final String SHOW = "1";
	private static final String EDIT = "2";
	private static final String DELETE = "3";
	private static final String FIND_BY_ID = "4";
	private static final String FIND_BY_NAME = "5";
	private static final String EXIT = "6";
	
	private final Input input;
	private final Tracker2 tracker;

	public StartUI(Input input, Tracker2 tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	public static void main(String[] args) {
		new StartUI(new ConsoleInput(), new Tracker2()).init();
	}
	
	/**
	* Основной цикл программы.
	*/
	public void init() {
		boolean exit = false;
		while (!exit) {
			this.showMenu();
			String answer = this.input.ask("Введите пункт меню: ");
			if (ADD.equals(answer)) {
				this.createItem();
			} else if (SHOW.equals(answer)) {	
				this.showItems();
			} else if (EDIT.equals(answer)) {
				this.editItem();
			} else if (DELETE.equals(answer)) {
				this.deleteItem();
			} else if (FIND_BY_ID.equals(answer)) {
				this.findByIdItem();
			} else if (FIND_BY_NAME.equals(answer)) {
				this.findByNameItem();
			} else if (EXIT.equals(answer)) {
				exit = true;
			} 
		}		
	}
		
	/**
	* Меню.
	*/
	private void showMenu() {
		System.out.println("Меню:");
		System.out.println("0.Добавить запись.");
		System.out.println("1.Показать записи.");
		System.out.println("2.Редактировать запись.");
		System.out.println("3.Удалить запись.");
		System.out.println("4.Найти запись по Id.");
		System.out.println("5.Найти запись по имени.");
		System.out.println("6.Выход.");
	}
	
		/**
	* Добавление новой записи.
	*/	
	private void createItem() {
		System.out.println("--------------Добавление новой записи----------------");
		String name = this.input.ask("Введите имя заявки: ");
		String desc = this.input.ask("Введите описание заявки: ");
		Date time = new Date();
		Item item = new Item(name, desc, time.getTime());
		this.tracker.add(item);
		System.out.println("--------------Новая заявка с Id: " + item.getId() + "---------");
		System.out.println(" ");
	}
	
	/**
	* Показывает имеющиеся записи.
	*/
	private void showItems() {
		System.out.println("-------------------Найдены записи--------------------------");
		Item[] zap = this.tracker.getAll();
		for (Item it : zap) {
			System.out.println("Заявка: " + it.getName() + " (Id - " + it.getId() + ") - " + it.getDesc() + ", создана " + it.getCreated());
		}
		System.out.println("-------------------Конец списка--------------------------");
		System.out.println(" ");
	}
	
	/**
	* Редактирование записи.
	*/
	private void editItem() {
		System.out.println("--------------Редактирование записи------------");
		String id = this.input.ask("Введите Id заявки: ");
		String name = this.input.ask("Введите новое имя заявки: ");
		String desc = this.input.ask("Введите новое описание заявки: ");
		Date time = new Date();
		Item item = new Item(name, desc, time.getTime());
		this.tracker.replace(id, item);
		System.out.println("------------------Заявка с Id: " + item.getId() + " изменена-----------------");
		System.out.println(" ");
	}
	
	/**
	* Удаление записи.
	*/
	private void deleteItem() {
		System.out.println("----------------Удаление записи------------------");
		String id = this.input.ask("Введите Id заявки на удаление: ");
		this.tracker.delete(id);
		System.out.println("------------------Заявка с Id: " + id + " удалена-----------------");
		System.out.println(" ");
	}
	
	/**
	* Поиск записи по Id.
	*/
	private void findByIdItem() {
		System.out.println("----------------Поиск записи по Id------------------");
		String id = this.input.ask("Введите Id заявки: ");
		Item findItem = this.tracker.findById(id);
		System.out.println("Найдена заявка: " + findItem.getName() + " (Id - " + findItem.getId() + ") - " + findItem.getDesc() + ", создана " + findItem.getCreated());
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
	}
	
	/**
	* Поиск записи по имени.
	*/
	private void findByNameItem() {
		System.out.println("----------------Поиск записи по Id------------------");
		String name = this.input.ask("Введите имя заявки: ");
		Item[] findItem = this.tracker.findByName(name);
		for (Item fit : findItem) {
			System.out.println("Найдена заявка: " + fit.getName() + " (Id - " + fit.getId() + ") - " + fit.getDesc() + ", создана " + fit.getCreated());
		}
		System.out.println("---------------------------------------------------");
		System.out.println(" ");
	}
}