package ru.job4j.condition;

/**
* Бот.
* 
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 25.02.2018
*/

public class DummyBot {
	
	/**
	* Отвечает на вопросы.
	* @param question Вопрос пользователя.
	* @return Ответ.
	*/
	public String answer(String question) {
		String rls = "Это ставит меня в тупик. Спросите другой вопрос.";
		
		if ("Привет, Бот".equals(question)) {
			rls = "Привет, умник.";
		} else if ("Пока.".equals(question)) {
			rls = "До скорой встречи.";
		}
		return rls;
	}
}