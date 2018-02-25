package ru.job4j.max;

/**
* Максимум из 2-х чисел.
*
* @author Evgeny Nochkin (nochjo@yandex.ru)
* @since 25.02.2018
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
}