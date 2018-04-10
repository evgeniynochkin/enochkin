package ru.job4j.tracker2;

import ru.job4j.tracker2.Item;

import java.util.Arrays;
import java.util.Random;

/**
* Класс-обертка Tracker.
*
* @author Evgeniy Nochkin (nochjj@yandex.ru)
* @since 2.0
*/
public class Tracker2 {
	private Item[] items;
	private int count;

	public Item[] getItems() {
		return Arrays.copyOf(this.items, this.items.length);
	}

	/**
	* Добавление заявки.
	* @param item.
	*/
	public void add(Item item) {
		if (items != null) {
			count = this.items.length;
			Item[] array = new Item[count];
			for (int i = 0; i < items.length; i++) {
				array[i] = items[i];
			}
			items = new Item[count + 1];
			for (int i = 0; i < items.length - 1; i++) {
				this.items[i] = array[i];
			}
			item.setId(generateId());
			this.items[count] = item;
		} else {
			items = new Item[1];
			item.setId(generateId());
			this.items[0] = item;
		}
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
		if (items != null) {
			for (int i = 0; i < items.length; i++) {
				if (getItems()[i].getId().equals(id)) {
					for (int j = i; j < items.length - 1; j++) {
						items[j] = items[j + 1];
					}
				}
			}
			items = Arrays.copyOf(items, items.length - 1);
		}
	}

	public Item[] getAll() {
		return items;
	}


	/**
	* Получение списка по имени.
	* @param name.
	* @return Array of items by name.
	*/
	public Item[] findByName(String name) {
		Item[] rsl = new Item[items.length];
		count = 0;
		for (Item zap : items) {
			if (zap.getName().equals(name)) {
				rsl[count] = zap;
				count++;
			}
		}
		return Arrays.copyOf(rsl, count);
	}
	
	/**
	* Получение заявки по id.
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
			if (items[0] != null) {
				for (int i = 0; i < items.length - 1; i++) {
					if (items[i].getId().equals(id)) {
						id = null; 
					}
				}
			}
		} while (id == null);
		return id;
	}
	
	/**
	* Получение индекса записи по id.
	* @param id.
	* @return index.
	*/
	private int findIndexById(String id) {
		int index = 0;
		for (int i = 0; i < this.items.length; i++) {
			if (this.items[i].getId().equals(id)) {
				index = i;
				break;
			} 
		}
		return index;
	}
}