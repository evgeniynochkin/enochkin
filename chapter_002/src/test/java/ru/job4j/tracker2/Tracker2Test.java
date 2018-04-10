package ru.job4j.tracker2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Tracker2Test {
	
	@Test
	public void testAddAndFind() {
		Tracker2 tracker = new Tracker2();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.getItems()[0], is(item));
	}
	
	@Test
	public void testFindByName() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test1", "testDesc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 124L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 125L);
		tracker.add(item3);
		Item item4 = new Item("test2", "testDesc4", 126L);
		tracker.add(item4);
		Item item5 = new Item("test4", "testDesc5", 127L);
		tracker.add(item5);
		Item item6 = new Item("test2", "testDesc6", 128L);
		tracker.add(item6);
		Item[] itemF = {item2, item4, item6};
		assertThat(tracker.findByName("test2"), is(itemF));
	}
	
	@Test
	public void testDelete() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test1", "testDesc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 124L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 125L);
		tracker.add(item3);
		Item item4 = new Item("test2", "testDesc4", 126L);
		tracker.add(item4);
		Item item5 = new Item("test4", "testDesc5", 127L);
		tracker.add(item5);
		Item item6 = new Item("test2", "testDesc6", 128L);
		tracker.add(item6);
		Item[] itemD = {item1, item2, item3, item5, item6};
		String rst = tracker.getItems()[3].getId();
		tracker.delete(rst);
		assertThat(tracker.getAll(), is(itemD));
	}
	
	@Test
	public void testFindById() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test1", "testDesc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 124L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 125L);
		tracker.add(item3);
		Item item4 = new Item("test2", "testDesc4", 126L);
		tracker.add(item4);
		Item item5 = new Item("test4", "testDesc5", 127L);
		tracker.add(item5);
		Item item6 = new Item("test2", "testDesc6", 128L);
		tracker.add(item6);
		String rstId = tracker.getItems()[4].getId();
		assertThat(tracker.findById(rstId), is(item5));
	}
	
	@Test
	public void testReplace() {
		Tracker2 tracker = new Tracker2();
		Item item1 = new Item("test1", "testDesc1", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDesc2", 124L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDesc3", 125L);
		tracker.add(item3);
		Item item4 = new Item("test2", "testDesc4", 126L);
		tracker.add(item4);
		Item item5 = new Item("test4", "testDesc5", 127L);
		tracker.add(item5);
		Item item6 = new Item("test2", "testDesc6", 128L);
		tracker.add(item6);
		Item item7 = new Item("test7", "testDesc7", 130L);
		String rstId = tracker.getItems()[2].getId();
		tracker.replace(rstId, item7);
		Item[] itemR = {item1, item2, item7, item4, item5, item6};
		assertThat(tracker.getAll(), is(itemR));
	}
}