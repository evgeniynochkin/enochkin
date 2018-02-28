package ru.job4j.max;

/**
* Максимум из 2-х чисел.
*
* @author Evgeny Nochkin (nochjo@yandex.ru)
* @since v.2.0, 28.02.2018
*/

public class Max {
	
	/**
	* Определение максимума.
	* @param first, second 2 числа.
	* @return Максимальное число.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}

	/**
	* Максимум из 3-х чисел
	* @param first, second, third.
	* @return Максимальное число.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}

