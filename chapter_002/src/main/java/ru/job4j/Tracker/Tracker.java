package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

/**
* Класс-обертка Tracker.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 3.0
*/
public class Tracker {
	public Item[] items = new Item[100];
	public int position = 0;
	
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
	public void replace(String id, Item item) {
		int i = findIndexById(id);
		items[i] = item;
	}
	
	/**
	* Удаление заявки.
	* @param id.
	*/
	public void delete(String id) {
		for (int i = 0; i < this.position; i++) {
			if (this.items[i].getId().equals(id)) {
				//this.items[i] = this.items[position - 1];
				//this.items[position - 1] = null;
				Item[] temp = new Item[100];
				System.arraycopy(items, 0, temp, 0, i);
				System.arraycopy(items, i + 1, temp, i, position - i - 1);
				items = temp;
				position--;
				break;
			}
		}
	}
	
	/**
	* Получение списка по имени.
	* @param name.
	* @return Array of items by name.
	*/
	public Item[] findByName(String name) {
		Item[] rst = new Item[position];
		int count2 = 0;
		for (int i = 0; i < this.position; i++) {
			if (this.items[i].getName().equals(name)) {
				rst[count2] = this.items[i];
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
	public Item findById(String id) {
		return items[findIndexById(id)];
	}
	
	/**
	* Метод генерации уникального ключа.
	* @return id.
	*/
	private String generateId() {
		String id = null;
		final Random rnd = new Random();
		do {
			id = String.valueOf(rnd.nextInt());
			for (int i = 0; i < this.position; i++) {
				if (this.items[i].getId().equals(id)) {
					id = null;
				}
			}
		} while (id == null);
		return String.valueOf(rnd.nextInt());
	}
	
		private int findIndexById(String id) {
		int index = 0;
		for (int i = 0; i < this.position; i++) {
			if (this.items[i].getId().equals(id)) {
				index = i;
				break;
			} 
		}
		return index;
	}

	public Item[] getAll() {
		return Arrays.copyOf(items, position);
	}
}