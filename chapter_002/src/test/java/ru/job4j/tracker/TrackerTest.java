package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
	
	@Test
	public void testAddAndFind() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.findAll()[0], is(item));
	}
	
	@Test
	public void testFindByName() {
		Tracker tracker = new Tracker();
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
		Tracker tracker = new Tracker();
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
		tracker.delete(item4.getId());
		assertThat(tracker.findAll(), is(itemD));
	}
}