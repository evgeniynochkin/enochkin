package ru.job4j.array;

import java.util.Arrays;

/**
* Удаление дубликатов в массиве.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 05.03.2018
* @version v.2.0
*/
public class ArrayDublicate {
	
	/**
	* Удаление дубликатов в массиве.
	* @param array Строковый массив.
	* @return array Новый массив (без повторений).
	*/
	public String[] remove(String[] array) {
		int count = array.length;
		String prov;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) { // Проверяем элемент массива на наличие ссылки.
				break; 
			}
			prov = array[i];
			int j = i + 1; //Начинаем сравнение со следующего элемента после i
			while (array[j] != null) { // Пока есть проверяемые элементы (ссылки)
				if (prov.equals(array[j])) {
					array[j] = array[count - 1]; // На место дубликата ставим последний элемент массива.
					array[count - 1] = null; // Последний элемент обнуляем.
					count--; // Уменьшаем счетчик размера массива на 1.
				} else { 
					j++; //Переходим к сравнению исходного элемента со следующим.
				}
			}
		}
		return Arrays.copyOf(array, count);
	}
}