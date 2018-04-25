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
	private Tracker tracker;

	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	/**
	* Основной цикл программы.
	*/
	public void init() {
		MenuTracker menu = new MenuTracker(this.input, this.tracker);
		menu.fillActions();
		do {
			menu.show();
			menu.select(input.ask("Select:", ranges));
		} while (!"y".equals(this.input.ask("Exit? (y): ")));
	}

	public static void main(String[] args) {
		new StartUI(
				new ValidateInput(
						new ConsoleInput()
				),
				new Tracker()
		).init();
	}
}