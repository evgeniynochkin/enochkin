import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import ru.job4j.loop.*;

public class CounterTest {
	@Test
	public void whenSummFrom10To20Equal90() {
		// создаем объект класса Counter.
		Counter a = new Counter();
		// Вычисляем сумму четных чисел.
		int result = a.add(10, 20);
		//Проверяем результат и ожидаемое значение.
		assertThat(result, is(90));
	}
}