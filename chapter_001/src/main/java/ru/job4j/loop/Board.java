package ru.job4j.loop;

/**
* Шахматная строка в псевдографике.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 01.03.2018
*/

public class Board {
	
	/**
	* Прорисовка шахматной доски.
	* @param width, heith Размеры.
	*/
	public String paint(int width, int height) {
		StringBuilder screen = new StringBuilder();
		String ln = System.lineSeparator();
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if ((i + j) % 2 == 0) {
					screen.append("x");
				} else {
					screen.append(" ");
				}
			}
			screen.append(ln);
		}
		return screen.toString();
	}
}