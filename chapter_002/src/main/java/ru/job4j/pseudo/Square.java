package ru.job4j.pseudo;

/**
* Рисование квадрата.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since v.1.0
*/

public class Square implements Shape {
	
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("++++");
		pic.append("+  +");
		pic.append("+  +");
		pic.append("++++");
		return pic.toString();
	}
}