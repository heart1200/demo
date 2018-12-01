package com.sigleton;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonHungry hungry1 = SingletonHungry.getSingletonHungry();
		SingletonHungry hungry2 = SingletonHungry.getSingletonHungry();
		System.out.println(hungry1);
		System.out.println(hungry2);
		SingletonLazy lazy1 = SingletonLazy.getSingletonLazy();
		SingletonLazy lazy2 = SingletonLazy.getSingletonLazy();
		System.out.println(lazy1);
		System.out.println(lazy2);

	}

}
