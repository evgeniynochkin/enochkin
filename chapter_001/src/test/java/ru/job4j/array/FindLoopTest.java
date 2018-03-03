package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
	
	@Test
	public void whenFind3In12345() {
		FindLoop fLoop = new FindLoop();
		int[] mass = {1, 2, 3, 4, 5};
		int rsl = fLoop.indexOf(mass, 3);
		assertThat(rsl, is(2));
	}
	
	@Test
	public void whenFind7In1234() {
		FindLoop fLoop = new FindLoop();
		int[] mass = {1, 2, 3, 4};
		int rsl = fLoop.indexOf(mass, 7);
		assertThat(rsl, is(-1));
	}
}