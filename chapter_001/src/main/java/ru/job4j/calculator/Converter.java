package ru.job4j.calculator;

/**
 * Конвертор валюты.
 *
 * @author Evgeniy Nochkin (nochjo@yandex.ru)
 * @since 24.02.2018
*/
 
public class Converter {
	
	private int result;
	private int evro = 70;
	private int doll = 60;
	
	/**
	 * Конвертируем рубли в евро.
	 * @param value рубли.
	 * @return Result.
	 */
	public int rubleToEvro(int value) {
		this.result = value * evro;
		return this.result;
	}
	
	/**
	 * Конвентируем рубли в доллары.
	 * @param value рубли.
	 * @return Result.
	 */
	public int rubleToDollars(int value) {
		this.result = value * doll;
		return this.result;
	}
	
	/**
	 * Конвертация евро в рубли.
	 * @param value евро.
	 * @return Result.
	 */
	public int evroToRuble(int value) {
		this.result = value / evro;
		return this.result;
	}
	
	/**
	 * Конвертируем доллары в рубли.
	 * @param value доллары.
	 * @return Result.
	 */
	public int dollarsToRuble(int value) {
		this.result = value / doll;
		return this.result;
	}
}