package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
	
	@Test
	public void when12345Equall54321() {
		Turn tMass = new Turn();
		int[] mass = {1, 2, 3, 4, 5};
		int[] rsl = tMass.back(mass);
		int[] exp = {5, 4, 3, 2, 1};
		assertThat(rsl, is(exp));
	}
	
	@Test
	public void when2468Equal8642() {
		Turn tMass = new Turn();
		int[] mass = {2, 4, 6, 8};
		int[] rsl = tMass.back(mass);
		int[] exp = {8, 6, 4, 2};
		assertThat(rsl, is(exp));
	}
}