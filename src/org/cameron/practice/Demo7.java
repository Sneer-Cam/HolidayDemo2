package org.cameron.practice;

public class Demo7 {
	public static void main(String[] args) {
		Person tom = new Person(18);
		Person bob = new Person(1.78f);
		
		System.out.println("tom's age:"+tom.age);
		System.out.println("bob's height:"+bob.height);
		
		tom.speak();
		bob.speak();
	}

}
