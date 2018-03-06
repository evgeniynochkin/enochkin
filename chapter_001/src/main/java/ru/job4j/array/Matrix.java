package ru.job4j.array;

/**
* Таблица умножения.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 04.03.2018
*/
public class Matrix {
	
	/**
	* Таблица умножения.
	* @param size Размер.
	* @return Массив.
	*/
	public int[][] multiple(int size) {
		int[][] massiv = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				massiv[i][j] = (i + 1) * (j + 1);
			}
		}
		return massiv;
	}
}