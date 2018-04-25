package ru.job4j.tracker;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
	
	private final Tracker tracker = new Tracker();
	
	@Before
	public void loadOutput() {
		Item item1 = new Item("test name1", "desc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test name2", "desc2", 123L);
		tracker.add(item2);
		Item item3 = new Item("test name3", "desc3", 123L);
		tracker.add(item3);
	}
	
	@Test
	public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
		Input input = new StubInput(new String[]{"0", "test name4", "desc4", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[3].getName(), is("test name4"));
	}
	
	@Test
	public void whenUserWhatLookAllItems() {
		Input input = new StubInput(new String[]{"1", "6"});
		new StartUI(input, tracker).init();
		Item[] rst = {tracker.getAll()[0], tracker.getAll()[1], tracker.getAll()[2]};
		assertThat(tracker.getAll(), is(rst));
	}

	@Test
	public void whenUserReplaceItemThenTrackerHasEditItemById() {
		Input input = new StubInput(new String[]{"2", tracker.getAll()[1].getId(), "new test name2", "new desc2", "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[1].getName(), is("new test name2"));
	}
	
	@Test
	public void whenUserDeleteItem() {
		Input input = new StubInput(new String[]{"3", tracker.getAll()[1].getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[1].getName(), is("test name3"));
	}
	
	@Test
	public void whenUserFindItemById() {
		Input input = new StubInput(new String[]{"4", tracker.getAll()[0].getId(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[0].getName(), is("test name1"));
	}
	
	@Test
	public void whenUserFindItemByName() {
		Input input = new StubInput(new String[]{"5", tracker.getAll()[2].getName(), "6"});
		new StartUI(input, tracker).init();
		assertThat(tracker.getAll()[2].getName(), is("test name3"));
	}
}