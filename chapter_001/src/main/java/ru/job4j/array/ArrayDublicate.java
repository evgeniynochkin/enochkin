package ru.job4j.array;

import java.util.Arrays;

/**
* Удаление дубликатов в массиве.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 04.03.2018
*/
public class ArrayDublicate {
	
	/**
	* Удаление дубликатов в массиве.
	* @param array Строковый массив.
	* @return array Новый массив (без повторений).
	*/
	public String[] remove(String[] array) {
		String tmp;
		int count = 0;
		// Удаляем дубликаты.
		for (int i = 0; i < array.length; i++) {
			String prov = array[i];
			for (int j = (i + 1); j < array.length; j++) {
				if (prov != null) {
					if (prov.equals(array[j])) {
						array[j] = null;
					}
				}
			}
		}
		// Убираем все null в конец.
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] == null) {
					array[j] = array[j + 1];
					array[j + 1] = null;
				}
			}
		}
		// Считаем количество уникальных записей.
		for (String i : array) {
			if (i != null) {
				count++;
			}
		}
		array = Arrays.copyOf(array, count);
		return array;
	}
}