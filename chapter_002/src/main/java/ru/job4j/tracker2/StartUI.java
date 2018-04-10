package ru.job4j.tracker2;

/**
* Основной класс Trackera.
*
* @author Evgeniy Nochkin
* @since 2.0
*/

public class StartUI {
	private Input input;

	public StartUI(Input input) {
		this.input = input;
	}
	
	/**
	* Основной цикл программы.
	*/
	public void init() {
		Tracker2 tracker = new Tracker2();
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		do {
			menu.show();
			int key = Integer.valueOf(input.ask("Select menu: "));
			menu.select(key);
		} while (!"y".equals(this.input.ask("Exit? (y): ")));
	}

	public static void main(String[] args) {
		Input input = new ConsoleInput();
		new StartUI(input).init();
	}
}