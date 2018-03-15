package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

/**
* Класс-обертка Tracker.
*
* @author Evgeniy Nochkin (nochjj@yandex.ru)
* @since 1.0
*/
public class Tracker {
	private Item[] items = new Item[100];
	private int position = 0;
	
	/**
	* Добавление заявки.
	* @param item.
	* @return item.
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}
	
	/**
	* Редактирование заявки.
	* @param id, item.
	*/
	/*public void replace(String id, Item item) {
		
	}*/
	
	/**
	* Удаление заявки.
	* @param id.
	*/
	public void delete(String id) {
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i] != null & this.items[i].getId().equals(id)) {
				this.items[i] = null;
			}
		}
	}
	
	/**
	* Получение списка всех имеющихся заявок.
	* @return Array of items not null.
	*/
	public Item[] findAll() {
		Item[] rst = new Item[100];
		int count = 0;
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i] != null) {
				rst[count] = items[i];
				count++;
			}
		}
		return Arrays.copyOf(rst, count);
	}
	
	/**
	* Получение списка по имени.
	* @param name.
	* @return Array of items by name.
	*/
	public Item[] findByName(String name) {
		Item[] rst = this.findAll();
		int count2 = 0;
		for (Item zap : this.findAll()) {
			if (zap != null & zap.getName().equals(name)) {
				rst[count2] = zap;
				count2++;
			}
		}
		return Arrays.copyOf(rst, count2);
	}
	
	/**
	* Получение заяыки по id.
	* @param id.
	* @return item.
	*/
	/*public Item findById(String id) {
		
		return item[];
	}
	
	/**
	* Метод генерации уникального ключа.
	* @return id.
	*/
	private String generateId() {
		//String id = null;
		final Random rnd = new Random();
		/*do {
			id = String.valueOf(rnd.nextInt());
			for (Item zap : items) {
				if (zap.getId() != null & zap.getId().equals(id)) {
					id = null;
				}
			}
			for (int i = 0; i < items.length; i++) {
				if (items[i].getId().equals(id)) {
					id = null; 
				}
			}
		} while (id == null);*/
		return String.valueOf(rnd.nextInt());
	}
}