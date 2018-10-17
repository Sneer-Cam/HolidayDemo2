package org.cameron.practice;

public class Person4 {// Demo16
	int age = 10;
	
	Car car;
	
	public Person4() {
		car = new Car();
	}
	
	void start() {
		car.playCar();
	}
	
	void eat() {
		System.out.println("eat");
	}
	
	class Car {// ÄÚ²¿Àà
		void playCar() {
			System.out.println("play car");
			System.out.println("person age:"+age);
			eat();
		}
	}
}
