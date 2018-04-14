package ru.job4j.tracker;

import java.util.Date;

/**
* Меню.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 1.0
*/

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[7];
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	public void fillActions() {
		this.actions[0] = new AddItem();
		this.actions[1] = new MenuTracker.ShowItems();
		this.actions[2] = new EditItem();
		this.actions[3] = new MenuTracker.DeleteItem();
		this.actions[4] = new FindItemById();
		this.actions[5] = new FindItemByName();
		this.actions[6] = new Exit();
	}
	
	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
	
	public void show() {
		for (UserAction action : this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}

	public Item createItem(Input input, Tracker tracker) {
		String name = input.ask("Input name: ");
		String desc = input.ask("Input desc: ");
		Date time = new Date();
		Item item = new Item(name, desc, time.getTime());
		return item;
	}
	
	/**
	* Внутренний класс добавления Item.
	*/
	private class AddItem implements UserAction {
		public int key() {
			return 0;
		}
		
		public void execute(Input input, Tracker tracker) {
			tracker.add(createItem(input, tracker));
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Add the new item: ");
		}
	}

	/**
	 * Внутренний класс редактирования записи по ID.
	 */

	private class EditItem implements UserAction {
		public int key() {
			return 2;
		}

		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Input id: ");
			Item item;
			item = createItem(input, tracker);
			item.setId(id);
			tracker.replace(id, item);
		}

		public String info() {
			return String.format("%s. %s", this.key(), "Edit the item: ");
		}
	}

	/**
	* Внутренний класс вывода записей.
	*/
	private static class ShowItems implements UserAction {
		public int key() {
			return 1;
		}
		
		public void execute(Input input, Tracker tracker) {
			Item[] zap = tracker.getAll();
			for (Item it : zap) {
				System.out.println(
					String.format("Заявка: %s (Id - %s) - %s, создана %s", it.getName(), it.getId(), it.getDesc(), it.getCreated())
				);
			}
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items: ");
		}
	}
	
	/**
	* Внутренний класс удаления записи.
	*/
	private static class DeleteItem implements UserAction {
		public int key() {
			return 3;
		}
		
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Input ID for delete: ");
			tracker.delete(id);
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Delete item: ");
		}
	}
	
	/**
	* Внутренний класс поиска по ID.
	*/
	private class FindItemById implements UserAction {
		public int key() {
			return 4;
		}
		
		public void execute(Input input, Tracker tracker) {
			String id = input.ask("Input ID: ");
			Item findItem = tracker.findById(id);
			System.out.println(
				String.format("Найдена заявка %s (Id - %s) - %s, создана %s", findItem.getName(), findItem.getId(), findItem.getDesc(), findItem.getCreated())
			);
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by ID: ");
		}
	}
	
	/**
	* Внутренний класс поиска по имени.
	*/
	private class FindItemByName implements UserAction {
		public int key() {
			return 5;
		}
		
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Input Name: ");
			Item[] findItem = tracker.findByName(name);
			for (Item fit : findItem) {
				System.out.println(
					String.format("Найдена заявка %s (Id - %s) - %s, создана %s", fit.getName(), fit.getId(), fit.getDesc(), fit.getCreated())
				);
			}
		}
		
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by Name: ");
		}
	}

    /**
     * Завершение работы программы.
     */
    private class Exit implements UserAction {
        public int key() {
            return 6;
        }

        public void execute(Input input, Tracker tracker) {
            System.exit(0);
        }

        public String info() {
			return String.format("%s. %s", this.key(), "Exit: ");
        }
    }
}