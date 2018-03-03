package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
	@Test
	public void whenArray5() {
		Square arr = new Square();
		int[] result = arr.calculate(5);
		int[] expected = {1, 4, 9, 16, 25};
		assertThat(result, is(expected));
	}
}