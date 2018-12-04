package com.abstracts;

public class Sparrow extends Bird{

	@Override
	public void fly() {
		System.out.println("Sparrows can fly, but only 50m hight");
	}

	@Override
	public void eat() {
		System.out.println("Sparrows likes eat bugs");
	}

}
