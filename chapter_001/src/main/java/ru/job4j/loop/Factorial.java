package ru.job4j.loop;

/**
* Вычисление факториала.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 28.02.2018
*/
public class Factorial {
	
		/**
	* Считаем факториал.
	* @param chislo.
	* @return Факториал.
	*/
	public int calc(int n) {
		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}