package ru.job4j.pseudo;

import java.lang.StringBuilder;

/**
* Рисование треугольника.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since v.1.0
*/

public class Triangle implements Shape {
	
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("   +   ");
		pic.append("  + +  ");
		pic.append(" +   + ");
		pic.append("+++++++");
		return pic.toString();
	}
}