package ru.job4j.condition;

/**
* Вычисление площади треугольника.
*
* @author Nochkin Evgeniy (nochjo@yandex.ru)
* @since 26.02.2018
*/

import static java.lang.Math.*;

public class Triangle {
	
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	* Вычисление полупериметра.
	*
	* (ab + ac + bc) / 2
	*
	* @param ab расстояние между точками a b
	* @param ac расстояние между точками a c
	* @param bc расстояние между точками b c
	*/
	private double polperim(double ab, double ac, double bc) {
		return (ab + ac + bc) / 2;
	}
	
	/**
	* Площадь треугольника.
	*
	* @return Площадь треугольника или -1, если треугольника нет.
	*/
	public double area() {
		double rls = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.polperim(ab, ac, bc);
		if (this.exist(ab, ab, bc)) {
			return sqrt(p * (p - ab) * (p - ac) * (p - bc));
		} else {
			return rls;
		}
	}
	
	/**
	* Проверка наличия треугольника.
	*
	* @param ab расстояние между точками a b
	* @param ac расстояние между точками a c
	* @param bc расстояние между точками b c
	* @return boolean
	*/
	private boolean exist(double ab, double ac, double bc) {
		return ab + bc > ac && ab + ac > bc && bc + ac > ab;
	}
}