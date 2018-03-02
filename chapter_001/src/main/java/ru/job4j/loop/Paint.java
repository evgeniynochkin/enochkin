package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
* Пирамида в псевдографике.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since v.2.0 02.03.2018
*/
public class Paint {
	
	/**
	* Прорисовка левой стороны пирамиды.
	* @param height
	*/
	public String leftTrl(int h) {
		return this.loopBy(h, h, (row, col) -> row >= h - 1 - col);
	}
	
	/**
	* Прорисовка правой стороны пирамиды.
	* @param height
	*/
	public String rightTrl(int h) {
		return this.loopBy(h, h, (row, col) -> row >= col);
	}

	/**
	* Прорисовка пирамиды.
	* @param height
	*/
	public String piramid(int h) {
		return this.loopBy(h, 2 * h - 1, (row, col) -> row >= h - 1 - col && row + h - 1 >= col);
	}
	
	/**
	* Универсальный метод.
	* @param height, weight, predict
	*/
	public String loopBy(int h, int w, BiPredicate<Integer, Integer> predict) {
		StringBuilder screen = new StringBuilder();
		for (int row = 0; row != h; row++) {
			for (int col = 0; col != w; col++) {
				if (predict.test(row, col)) {
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