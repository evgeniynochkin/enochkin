package ru.job4j.array;

/**
* Одномерный массив квадратов чисел.
*
* @author Evgeniy Nochkin (nochjo@yandex.ry)
* @since 03.03.2018
*/
public class Square {
	
	/**
	* Заполнение массива квадратами чисел.
	* @param bound Размер массива.
	* @return Заполненный массив.
	*/
	public int[] calculate(int bound) {
		int[] rst = new int[bound];
			for (int i = 1; i <= bound; i++) {
				rst[i - 1] = i * i;
			}
		return rst;
	}
}