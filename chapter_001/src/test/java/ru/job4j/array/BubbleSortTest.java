package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
	
	@Test
	public void whenSort753941Then134579() {
		BubbleSort aSort = new BubbleSort();
		int[] mass = {7, 5, 3, 9, 4, 1};
		int[] rsl = aSort.sort(mass);
		int[] exp = {1, 3, 4, 5, 7, 9};
		assertThat(rsl, is(exp));
	}
}