package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    
	@Test
    public void when10RubleToDollarThen600() {
        Converter converter = new Converter();
        int result = converter.rubleToDollars(10);
        assertThat(result, is(600));
    }

    @Test
    public void when10RubleToEuroThen700() {
        Converter converter = new Converter();
        int result = converter.rubleToEvro(10);
        assertThat(result, is(700));
    }
	
	@Test
    public void when180DollarsToRubleThen3() {
        Converter converter = new Converter();
        int result = converter.dollarsToRuble(180);
        assertThat(result, is(3));
    }
	
	@Test
    public void when280EvroToRubleThen4() {
        Converter converter = new Converter();
        int result = converter.evroToRuble(280);
        assertThat(result, is(4));
    }
}