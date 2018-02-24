package ru.job4j.calculator;

/**
 * Конвертор валюты.
 *
 * @author Evgeniy Nochkin (nochjo@yandex.ru)
 * @since 24.02.2018
*/
 
public class Converter {
	
	private static final int EVRO = 70;
	private static final int DOLL = 60;
	
	/**
	 * Конвертируем рубли в евро.
	 * @param value рубли.
	 * @return Result.
	 */
	public int rubleToEvro(int value) {
		return value * EVRO;
	}
	
	/**
	 * Конвентируем рубли в доллары.
	 * @param value рубли.
	 * @return Result.
	 */
	public int rubleToDollars(int value) {
		return value * DOLL;
	}
	
	/**
	 * Конвертация евро в рубли.
	 * @param value евро.
	 * @return Result.
	 */
	public int evroToRuble(int value) {
		return value / EVRO;
	}
	
	/**
	 * Конвертируем доллары в рубли.
	 * @param value доллары.
	 * @return Result.
	 */
	public int dollarsToRuble(int value) {
		return value / DOLL;
	}
}