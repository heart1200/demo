package com.duotai;

public class Ower {
	/**方案1，创建同样的多个方法，传入不同的子类对象，调用各自的独有的方法
	 * 缺点：当需要传入多个子类，代码会显得凌乱
	 * 	 * @param cat
	 */
//	public void feed(Cat cat) {
//		cat.eat();
//		cat.playBall();
//	}
//	
//	public void feed(Dog dog) {
//		dog.eat();
//		dog.sleep();
//	}
	
	//方案2，编写一个方法，传入他们的父类，通过方法转型，调用各自的方法
	public void feed(Animal animal) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.playBall();
		}else if(animal instanceof Dog){
			Dog dog = (Dog) animal;
			dog.sleep();
		}
	}

}
