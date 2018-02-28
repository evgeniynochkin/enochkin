package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
	
	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
	
	@Test
	public void whenSecondMoreFirstAndThird() {
		Max maxim = new Max();
		int result = maxim.max(5, 9, 4);
		assertThat(result, is(9));
	}
}