package com.demo.extendsLearn;

public class Cat extends Annimal{
	private String varieties;
	
//	public Cat(String name,int age) {
//		
//	}
	
	public String getVarieties() {
		return varieties;
	}

	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}

	public void cuty() {
		System.out.println("im cutty");
	}

}
