package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
	
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Tracker2 tracker = new Tracker2();
		Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[0].getName(), is("test name"));
	}

	@Test
	public void whenUserReplaceItemThenTrackerHasEditItemById() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test name1", "desc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test name2", "desc2", 123L);
		tracker.add(item2);
		Item item3 = new Item("test name3", "desc3", 123L);
		tracker.add(item3);
		Input input = new StubInput(new String[]{"2", item2.getId(), "new test name2", "new desc2", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[1].getName(), is("new test name2"));
	}
	
	@Test
	public void whenUserDeleteItem() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test name1", "desc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test name2", "desc2", 123L);
		tracker.add(item2);
		Item item3 = new Item("test name3", "desc3", 123L);
		tracker.add(item3);
		Input input = new StubInput(new String[]{"3", item2.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[1].getName(), is("test name3"));
	}
	
	@Test
	public void whenUserFindItemById() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test name1", "desc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test name2", "desc2", 123L);
		tracker.add(item2);
		Item item3 = new Item("test name3", "desc3", 123L);
		tracker.add(item3);
		Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[0].getName(), is("test name1"));
	}
	
	@Test
	public void whenUserFindItemByName() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test name1", "desc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test name2", "desc2", 123L);
		tracker.add(item2);
		Item item3 = new Item("test name3", "desc3", 123L);
		tracker.add(item3);
		Input input = new StubInput(new String[]{"5", item1.getName(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[2].getName(), is("test name3"));
	}
}