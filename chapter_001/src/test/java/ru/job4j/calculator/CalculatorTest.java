package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
	* Test class
	*
	* @author Nochkin Evgeniy (nochjo@yandex.ru)
*/

public class CalculatorTest {
	
	@Test //Test Summ
	public void whenAddOnePlusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	
	@Test //Test Sabtract
	public void whenRemoveThreeMinusOneThenTwo() {
		Calculator calc = new Calculator();
		calc.remove(3D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	
	@Test //Test Multiply
	public void whenMultiplyTwoMultiplyThreeThenSix() {
		Calculator calc = new Calculator();
		calc.multiply(2D, 3D);
		double result = calc.getResult();
		double expected = 6D;
		assertThat(result, is(expected));
	}
	
	@Test //TEst divide
	public void whenDivideSixDivideTwoThenThree() {
		Calculator calc = new Calculator();
		calc.divide(6D, 2D);
		double result = calc.getResult();
		double expected = 3D;
		assertThat(result, is(expected));
	}
	
}	