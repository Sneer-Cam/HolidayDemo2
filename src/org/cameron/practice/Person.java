package org.cameron.practice;

public class Person {//Demo7
	int age;
	float height;
	
	Person(int age) {
		this.age = age;
	}
	
	Person(float height){
		this.height = height;
	}
	
	void speak(){
		System.out.println("person");
	}
}
