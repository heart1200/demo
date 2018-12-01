package com.sigleton;

//饿汉式：创建对象实例的时候直接初始化
public class SingletonHungry {
	//1、创建类中私有构造
	private SingletonHungry() {
		
	}
	//2、创建该类型的私有静态实例
	private static SingletonHungry instance = new SingletonHungry();
	//3、创建公有静态方法返回静态实例对象
	public static SingletonHungry getSingletonHungry() {
		return instance;
		
	}

}
