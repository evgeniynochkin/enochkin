package ru.job4j.array;

/**
* Переворот массива.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 03.03.2018
*/
public class Turn {
	
	/**
	* Переворот массива.
	* @param array Массив/.
	* @return array Перевернутый массив.
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			int j = array.length - 1 - i;
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
}