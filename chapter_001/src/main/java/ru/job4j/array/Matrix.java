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
		int razmer = size + 1;
		int[][] massiv = new int[razmer][razmer];
		for (int i = 1; i < size + 1; i++) {
			massiv[0][i] = i;
			massiv[i][0] = i;
			for (int j = 1; j < size + 1; j++) {
				massiv[i][j] = i * j;
			}
		}
		return massiv;
	}
}