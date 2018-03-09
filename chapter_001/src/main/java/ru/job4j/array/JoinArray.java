package ru.job4j.array;

/**
* Объединение массивов.
*
* @author Evgeniy Nochkin (nochjo@yandex.ru)
* @since 09.03.2018
* @version v.1.0
*/
public class JoinArray {
	
	/**
	* Объединение массивов.
	* @param arrayFirst, arraySecond.
	* @return arrayUnity.
	*/
	public int[] join(int[] arrayFirst, int[] arraySecond) {
		int[] arrayUnity = new int[arrayFirst.length + arraySecond.length];
		int i = 0;
		int j = 0;
		int y = 0;
		while (y < arrayUnity.length) {
			if (i < arrayFirst.length && j < arraySecond.length && arrayFirst[i] < arraySecond[j]) {
				arrayUnity[y] = arrayFirst[i];
				i++;
			} else if (i < arrayFirst.length && j < arraySecond.length && arrayFirst[i] > arraySecond[j]) {
				arrayUnity[y] = arraySecond[j];
				j++;
			} else if (i < arrayFirst.length && j < arraySecond.length && arrayFirst[i] == arraySecond[j]) {
				arrayUnity[y] = arrayFirst[i];
				i++;
				y++;
				arrayUnity[y] = arraySecond[j];
				j++;
			} else if (i == arrayFirst.length && j < arraySecond.length) {
				arrayUnity[y] = arraySecond[j];
				j++;
			} else if (i < arrayFirst.length && j == arraySecond.length) {
				arrayUnity[y] = arrayFirst[i];
				i++;
			}
			y++;
		}
		return arrayUnity;
	}
}