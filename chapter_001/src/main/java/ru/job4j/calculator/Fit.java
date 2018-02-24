package ru.job4j.calculator;

/**
* Расчет идеального веса.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 24.02.2018
*/

public class Fit {

	private static final double MAN = 100;
	private static final double WOMAN = 110;
	private static final double PAR = 1.15;
	
	/**
	* Идеальный вес для мужчины.
	* @param height Рост.
	* @return Идеальный вес.
	*/
	double manWeight(double height) {
		return (height - MAN) * PAR;
	}
	
	/**
	* Идеальный вес для женщины.
	* @param height Рост.
	* @return Идеальный вес.
	*/
	double womanWeight(double height) {
		return (height - WOMAN) * PAR;
	}
}	