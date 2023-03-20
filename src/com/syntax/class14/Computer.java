package com.syntax.class14;

public class Computer {

	String monitor, brand, mouse, name;
	boolean keyboard;
	int size, memory, screen, ram;

	// define actions/behaviors
	void playGames() {
		System.out.println("I can play on my " + name);
	}

	void javaCoding() {
		System.out.println("I can do java coding on my " + name);

	}

	void watchMovie() {
		System.out.println("I can watch a movie on my " + name);
	}

	public static void main(String[] args) {

		Computer comp = new Computer();
		comp.brand = "Dell";
		comp.name = "Inspiron";
		comp.memory = 250;
		comp.keyboard = true;
		comp.size = 10000;

		System.out.println("I have " + comp.brand + " " + comp.name);
		// behaviors
		comp.playGames();
		comp.javaCoding();
		comp.watchMovie();

	}

}