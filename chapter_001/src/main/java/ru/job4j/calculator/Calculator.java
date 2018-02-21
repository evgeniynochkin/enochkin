package ru.job4j.calculator;

/**
	* Calculator
	*
	* @author Evgeniy Nochkin (nochjo@yandex.ru)
*/

public class Calculator {
	
	private double result;
	
	/**
		* Summ
		* @param first, second
	*/
	
	public void add(double first, double second) {
	
		this.result = first + second;
	
	}
	
	/**
		* Sabtract
		* @param first, second
	*/
	
	public void remove(double first, double second) {
		
		this.result = first - second;
		
	}
	
	/**
		* Multiply
		* @param first, second
	*/
	
	public void multiply(double first, double second) {
		
		this.result = first * second;
		
	}
	
	/** 
		* Divide
		* @param first, second
	*/
	
	public void divide(double first, double second) {
		
		this.result = first / second;
		
	}
	
	/**
		* Return result math
		* @return result
	*/
	
	public double getResult() {
		
		return this.result;
		
	}
}	