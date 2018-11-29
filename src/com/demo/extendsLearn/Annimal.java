package com.demo.extendsLearn;

public class Annimal {
	public String name;
	private int age;
    float weight;
    
    public Annimal() {
	}
    
	public Annimal(String name,int age) {
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		if (weight > 0 && weight < 200) {
			this.weight = weight;
		}else {
			System.out.println("you input wrong, and weight default set 5.");
			this.weight=5;
		}
		
	}
	
	public void run() {
		System.out.println("i can run");
	}
	
	public void eat() {
		System.out.println("i can eat");
	}
	
}
