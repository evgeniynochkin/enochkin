package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDublicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDublicate() {
        ArrayDublicate delDub = new ArrayDublicate();
		String[] array = {"Вася", "Коля", "Вася", "Леша", "Сережа", "Коля"};
		String[] mass = {"Вася", "Коля", "Сережа", "Леша"};
		String[] rsl = delDub.remove(array);
		assertThat(rsl, is(mass));
    }
	
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDublicate2() {
        ArrayDublicate delDub = new ArrayDublicate();
		String[] array = {"1", "1", "1", "1", "1", "1"};
		String[] mass = {"1"};
		String[] rsl = delDub.remove(array);
		assertThat(rsl, is(mass));
    }
}