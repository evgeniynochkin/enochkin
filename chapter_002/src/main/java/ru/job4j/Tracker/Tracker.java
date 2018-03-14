package ru.job4j.tracker;

import java.util.Random.*;
import java.util.Arrays;

/**
* Класс-обертка Tracker.
*
* @author Evgeniy Nochkin (nochjj@yandex.ru)
* @since 1.0
*/
public class Tracker {
	public Item[] items = new Item[100];
	private int position = 0;
	
	/**
	* Добавление заявки.
	* @param item.
	* @return item.
	*/
	public Item add(Item item) {
		item.setId("1");
		this.items[this.position++] = item;
		return item;
	}
	
	/**
	* Редактирование заявки.
	* @param id, item.
	*/
	/*public void replace(String id, Item item) {
		
	}
	
	/**
	* Удаление заявки.
	* @param id, item.
	*/
	/*public void delete(String id) {
		
	}
	
	/**
	* Получение списка всех имеющихся заявок.
	* @return items.
	*/
	public Item[] findAll() {
		int count = 0;
		while (items[count].getId() != null) {
			count++;
		}
		return Arrays.copyOf(items, count);
	}
	
	/**
	* Получение списка по имени.
	* @param key.
	* @return items.
	*/
	/*public Item[] findByName(String name) {
		
		return rst;
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
	/*private String generateId() {
		id = null;
		do {
			id = Random().next().toString();
			for (int i = 0; i < items.length; i++) {
				items[i].item.getId().equals(id) ? id = null : continue;
			}
		} while (id == null);
		return id;
	}*/
}