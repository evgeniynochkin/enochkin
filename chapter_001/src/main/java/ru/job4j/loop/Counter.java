package ru.job4j.loop;

/**
* Сумма четных чисел.

* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 28.02.2018
*/

public class Counter {
	
	private int summ;
	
	/**
	* Вычисление четных чисел в заданом диапазоне.
	*
	* @param start, finish Начало диапазона start и конец finish.
	* @return Сумма.
	*/
	public int add(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				summ = summ + i;
			}
		}
		return summ;
	}
}