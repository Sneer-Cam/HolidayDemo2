package org.cameron.practice;

public class Demo10 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(12.5);

		Ladder2 ladder2 = new Ladder2(10, 30, 15);

		People people = new People();
		System.out.println("people计算圆的面积：" + people.computerArea(circle));
		System.out.println("people计算梯形的面积：" + people.computerArea(ladder2));
	}

}
