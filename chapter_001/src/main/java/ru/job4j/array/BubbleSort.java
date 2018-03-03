package ru.job4j.array;

/**
* Сортировка массива "пузырьковым" методом.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 03.03.2018
*/
public class BubbleSort {
	
	/**
	* Сортировка массива "пузырьковым" методом.
	* @param array Масссив.
	* @return array Отсортированный массив.
	*/
	public int[] sort(int[] array) {
		int temp;
		int proh = array.length;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < proh - 1; j++)  {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			proh--;
		}
		return array;
	}
}