package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
	
	@Test
	public void test1() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		tracker.add(item);
		System.out.println(tracker.items[0].getId());
		System.out.println(tracker.findAll()[0].getId());
		System.out.println(tracker.findAll()[0].getName());
		System.out.println(tracker.findAll()[0].getDesc());
		System.out.println(tracker.findAll()[0].getCreated());
		//assertThat(tracker.findAll()[0], is(item));
	}
}