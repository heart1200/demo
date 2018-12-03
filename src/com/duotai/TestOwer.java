package com.duotai;

public class TestOwer {

	public static void main(String[] args) {
		//父类引用指向子类，引用不能使用子类独有的方法
		Animal animal = new Animal();
		Animal animal1 = new Cat("qqq",4,5);
		Cat cat = new Cat("hhh",2,3);
		Animal animal2 = new Dog();
		
		animal.eat();
		animal1.eat();
		animal2.eat();
		System.out.println(cat.getAge()+cat.getName()+cat.getWeight());
		System.out.println(animal1.getAge()+animal1.getName()+((Cat) animal1).getWeight());
		Ower ower = new Ower();
		Cat cat1 = new Cat();
		Dog dog = new Dog();
		
		ower.feed(cat1);
		ower.feed(dog);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ower.feed(cat);
		ower.feed(dog);
	}
	


}
