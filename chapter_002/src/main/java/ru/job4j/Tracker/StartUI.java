package ru.job4j.tracker;

import java.util.Date;

/**
* Основной класс Trackera.
*
* @author Evgeniy Nochkin
* @since 2.0
*/

public class StartUI {
	private int[] ranges = new int[] {0, 1, 2, 3, 4, 5, 6};
	private Input input;

	public StartUI(Input input) {
		this.input = input;
	}
	
	/**
	* Основной цикл программы.
	*/
	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do {
			menu.show();
			//int key = Integer.valueOf(input.ask("Select menu: "));
			menu.select(input.ask("Select:", ranges));
		} while (!"y".equals(this.input.ask("Exit? (y): ")));
	}

	public static void main(String[] args) {
		Input input = new ValidateInput();
		new StartUI(input).init();
	}
}