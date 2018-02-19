package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
	* Test.
	* 
	* @author Evgeniy Nochkin (nochjo@yandex.ru)
	* @version $Id$
	* @scine 0.1
*/

public class CalculateTest {
	
	/**
		* TestEcho.
		* @Test
	*/
	
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Evgeniy Nochkin";
		String expect = "Echo, echo, echo: Evgeniy Nochkin";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
	
}