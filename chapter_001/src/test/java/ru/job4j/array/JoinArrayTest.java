package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JoinArrayTest {
    @Test
    public void when1() {
		JoinArray mass = new JoinArray();
		int[] arrayFirst = {1, 3, 5, 7, 9};
		int[] arraySecond = {2, 4, 6, 8};
	    int[] rsl = mass.join(arrayFirst, arraySecond);
		int[] exp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertThat(rsl, is(exp));
    }
	
	@Test
    public void when2() {
		JoinArray mass = new JoinArray();
		int[] arrayFirst = {1, 1, 2, 3};
		int[] arraySecond = {2, 2, 3, 4};
	    int[] rsl = mass.join(arrayFirst, arraySecond);
		int[] exp = {1, 1, 2, 2, 2, 3, 3, 4};
		assertThat(rsl, is(exp));
    }
}