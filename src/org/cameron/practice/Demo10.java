package org.cameron.practice;

public class Demo10 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(12.5);

		Ladder2 ladder2 = new Ladder2(10, 30, 15);

		People people = new People();
		System.out.println("people����Բ�������" + people.computerArea(circle));
		System.out.println("people�������ε������" + people.computerArea(ladder2));
	}

}
