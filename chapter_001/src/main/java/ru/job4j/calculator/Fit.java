package ru.job4j.calculator;

/**
* Расчет идеального веса.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 24.02.2018
*/

public class Fit {

	private double result;
	
	/**
	* Идеальный вес для мужчины.
	* @param height Рост.
	* @return Идеальный вес.
	*/
	double manWeight(double height) {
		this.result = (height - 100) * 1.15D;
		return this.result;
	}
	
	/**
	* Идеальный вес для женщины.
	* @param height Рост.
	* @return Идеальный вес.
	*/
	double womanWeight(double height) {
		this.result = (height - 110) * 1.15D;
		return this.result;
	}
}	