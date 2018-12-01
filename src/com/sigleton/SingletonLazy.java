package com.sigleton;

//懒汉式：创建对象实例的时候直接初始化
public class SingletonLazy {
	//1、创建类中私有构造
	private SingletonLazy() {
		
	}
	
	//2、创建静态的该类实例对象
	private static SingletonLazy instance = null;
	
	//3、创建开放的静态方法提供实例对象
	public static SingletonLazy getSingletonLazy() {
		if (instance == null)
			instance = new SingletonLazy();
		return instance;
	}

}
