package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ContWordTest {
    @Test
    public void when1() {
		ContWord word = new ContWord();
	    boolean rsl = word.contains("Привет", "иве");
        assertThat(rsl, is(true));
    }

	@Test
    public void when2() {
		ContWord word = new ContWord();
	    boolean rsl = word.contains("Паровозик", "зик");
        assertThat(rsl, is(true));
    }
	
	@Test
    public void when3() {
		ContWord word = new ContWord();
	    boolean rsl = word.contains("Дым", "ку");
        assertThat(rsl, is(false));
    }
}