package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
	
	@Test
	public void factorial10() {
		// Создаем новый объект Factorial
		Factorial fact = new Factorial();
		// Рассчитываем факториал
		int result = fact.calc(10);
		//Проверяем результат и ожидаемое значение.
		assertThat(result, is(3628800));
	}
	
	@Test
	public void factorial7() {
		// Создаем новый объект Factorial
		Factorial fact = new Factorial();
		// Рассчитываем факториал
		int result = fact.calc(7);
		//Проверяем результат и ожидаемое значение.
		assertThat(result, is(5040));
	}
	
	@Test
	public void factorial0() {
		// Создаем новый объект Factorial
		Factorial fact = new Factorial();
		// Рассчитываем факториал
		int result = fact.calc(0);
		//Проверяем результат и ожидаемое значение.
		assertThat(result, is(1));
	}
}