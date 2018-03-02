package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
	@Test
	public void whenPyramid5() {
		Paint paint = new Paint();
		String rst = paint.piramid(5);
		System.out.println(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("    ^    ")
								.add("   ^^^   ")
								.add("  ^^^^^  ")
								.add(" ^^^^^^^ ")
								.add("^^^^^^^^^")
								.toString()
				)
		);
	}
	
	@Test
	public void whenPyramid7() {
		Paint paint = new Paint();
		String rst = paint.piramid(7);
		System.out.println(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
								.add("      ^      ")
								.add("     ^^^     ")
								.add("    ^^^^^    ")
								.add("   ^^^^^^^   ")
								.add("  ^^^^^^^^^  ")
								.add(" ^^^^^^^^^^^ ")
								.add("^^^^^^^^^^^^^")
								.toString()
				)
		);
	}
	
	@Test
	public void whenleftTrl3() {
		Paint paint = new Paint();
		String rst = paint.leftTrl(3);
		System.out.print(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
							.add("  ^")
							.add(" ^^")
							.add("^^^")
							.toString()
				)
		);
	}
	
	@Test
	public void whenrightTrl6() {
		Paint paint = new Paint();
		String rst = paint.rightTrl(6);
		System.out.print(rst);
		assertThat(rst,
				is(
						new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
							.add("^     ")
							.add("^^    ")
							.add("^^^   ")
							.add("^^^^  ")
							.add("^^^^^ ")
							.add("^^^^^^")
							.toString()
				)
		);
	}
}