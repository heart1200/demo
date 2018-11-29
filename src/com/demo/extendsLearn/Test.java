package com.demo.extendsLearn;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int age = 0;
		// TODO Auto-generated method stub
		boolean flag = true;
		while(flag) {
			System.out.println("pls input age:");
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			if (a >0 && a<=20) {
				age = a;
				flag = false;
			}else {
				System.out.println("input wrong,pls input 1~20.");
				flag = true;
			}
		}
		
		Cat cat1 = new Cat();
		cat1.setAge(age);
		cat1.setName("dada");
		cat1.setWeight(1000);
		System.out.println("name:"+cat1.getName());
		System.out.println("age:"+cat1.getAge());
		System.out.println("weight:"+cat1.getWeight());

	}

}
