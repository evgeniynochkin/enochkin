package ru.job4j.array;

/**
* Проверка наличия части в слове. 
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 09.03.2018
* @version v.1.0
*/
public class ContWord {
	
	/**
	* Поверка наличия части в слове.
	* @param origin, sub слово, часть слова.
	* @return boolean
	*/
	public boolean contains(String origin, String sub) {
		boolean rsl = false;
		char[] word = origin.toCharArray();
		char[] part = sub.toCharArray();
		int j;
		for (int i = 0; i < word.length + 1 - part.length; i++) {
			/*char p = word[i];
			for (int j = 0; j < word.length*/
			j = 0;
			do {
				if (word[i] == part[j]) {
					rsl = true;
					j++;
					i++;
				} else {
					rsl = false;
					break;
				}
			} while (j < part.length); 
		}
		return rsl;
	}
}