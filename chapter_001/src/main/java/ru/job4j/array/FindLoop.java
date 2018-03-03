package ru.job4j.array;

/**
* Поиск значения в массиве.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 03.03.2018
*/
public class FindLoop {
	
	/**
	* Поиск элемента в массиве.
	* @param data, el Размер массива, искомый элемент.
	* @return Индекс массива с искомым элементом.
	*/
	public int indexOf(int[] data, int el) {
		int rsl = -1;
		for (int index = 0; index < data.length; index++) {
			if (data[index] == el) {
				rsl = index;
				break;
			} 
		}
		return rsl;
	}
}