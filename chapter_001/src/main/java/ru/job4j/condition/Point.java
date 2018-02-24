package ru.job4j.condition;

/**
* Расстояние между точками.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 24.02.2018
*/

import static java.lang.Math.*;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	* Рассчитываем расточние.
	* @param object Point.
	* @return Distance.
	*/
	public double distanceTo(Point that) {
		return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
	}
}