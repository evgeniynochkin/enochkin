package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDublicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDublicate() {
        ArrayDublicate delDub = new ArrayDublicate();
		String[] array = {"Вася", "Коля", "Вася", "Леша", "Сережа", "Коля"};
		String[] mass = {"Вася", "Коля", "Леша", "Сережа"};
		String[] rsl = delDub.remove(array);
		assertThat(rsl, is(mass));
    }
}