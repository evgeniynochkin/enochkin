package ru.job4j.condition;

/**
* ���.
* 
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 25.02.2018
*/

public class DummyBot {
	
	/**
	* �������� �� �������.
	* @param question ������ ������������.
	* @return �����.
	*/
	public String answer(String question) {
		String rls = "��� ������ ���� � �����. �������� ������ ������.";
		
		if ("������, ���".equals(question)) {
			rls = "������, �����.";
		} else if ("����.".equals(question)) {
			rls = "�� ������ �������.";
		}
		return rls;
	}
}