package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    
	@Test
    public void whenPoint12And2Point25And6Then5() {
        Point point1 = new Point(2, 2);
		Point point2 = new Point(5, 6);
        double result = point1.distanceTo(point2);
        assertThat(result, is(5D));
    }
}