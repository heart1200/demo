package com.duotai;

public class Animal {
	private int age;
	private String name;
	
	public Animal() {
		
	}
	public Animal(String name,int age) {
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >0 && age < 20) {
			this.age = age;
		}else {
			System.out.println("Input age wrong, it will be defalut to 0.");
			this.age = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	public void run() {
//		System.out.println("Animal can run");
//	}
	public void eat() {
		System.out.println("Animal can eat");
	}

}
