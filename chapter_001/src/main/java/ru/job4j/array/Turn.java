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
		int ser;
		if (array.length % 2 == 0) {
			ser = array.length / 2;
		} else {
			ser = (array.length - 1) / 2;
		}
		for (int i = 0; i < ser; i++) {
			int temp = array[i];
			int j = array.length - 1 - i;
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
}