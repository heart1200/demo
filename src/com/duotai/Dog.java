package com.duotai;

public class Dog extends Animal{
	private String gender;
	
	public Dog() {
		
	}
	public Dog(String name,int age, String gender) {
		super(name,age);
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if (gender == "man" || gender == "woman") {
			this.gender = gender;
		}else {
			System.out.println("Input wrong, dog's gender will be default to man");
			this.gender = "man";
		}
	}
	
	@Override
	public void eat() {
		System.out.println("Dog likes eating bron");
	}
	public void sleep() {
		System.out.println("Dog always sleep in afternoon");
	}

}
