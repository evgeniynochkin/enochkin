package ru.job4j.tracker2;

public interface UserAction {
	
	int key();
	void execute(Input input, Tracker2 tracker);
	String info();
}