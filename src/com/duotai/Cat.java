package com.duotai;

public class Cat extends Animal {
	private double weight;
	
	public Cat() {
		
	}
	public Cat(String name,int age, double weight) {
		super(name,age);
		this.setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight>0 && weight <8) {
			this.weight = weight;
		}else {
			System.out.println("Input wrong, weight will be default to 0");
			this.weight = 0;
		}
	}
	
//	@Override
	public void run() {
		System.out.println("Cat runs slower");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat likes eating fish");
	}
	public void playBall() {
		System.out.println("cat likes play balls.");		
	}

}
