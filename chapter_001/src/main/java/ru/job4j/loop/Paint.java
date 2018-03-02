package ru.job4j.loop;

/**
* Пирамида в псевдографике.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 02.03.2018
*/
public class Paint {
	
	/**
	* Прорисовка пирамиды.
	* @param height
	*/
	public String piramid(int h) {
		StringBuilder screen = new StringBuilder();
		int w = 2 * h - 1;
		for (int row = 0; row != h; row++) {
			for (int col = 0; col != w; col++) {
				if (row >= h - 1 - col && row + h - 1 >= col) {
					screen.append("^");
				} else {
					screen.append(" ");
				}
			}
			screen.append(System.lineSeparator());
		}
		return screen.toString();
	}
}