package org.cameron.practice;

public class Demo17 {
	public static void main(String[] args) {
		// Person5 person = new Boy();
		// Test2 test = new Test2();
		// test.testCar(new Car3() {
		// @Override
		// void sound() {
		// System.out.println("eat");
		// }
		// });
		// test.testPerson(person);
		// test.testPerson(new Boy());
		// test.testPerson(new Person5() {
		//
		// @Override
		// void speak() {
		// System.out.println("匿名类说的话");
		// }
		// });

		// person = new Girl();
		// test.testPerson(person);

		// Ball ball = new RedBall();
		Test2 test2 = new Test2();
		// test2.testBall(new RedBall());
		test2.testBall(new Ball() {

			@Override
			public void getColor() {
				System.out.println("yellow");
			}
		});
		// ball = new BlueBall();
		// test2.testBall(ball);
	}

}
