package org.cameron.practice;

public class Man extends Person2{// Demo11
	int age = 35;
	
	public void test(){
		System.out.println("Person age:"+super.age);
		super.speak();
	}
	
	@Override
	public void speak() {
		System.out.println("Hello Man");
	}
}
