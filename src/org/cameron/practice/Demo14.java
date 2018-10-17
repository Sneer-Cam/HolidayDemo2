package org.cameron.practice;

public class Demo14 {
	public static void main(String[] args){
//		Car2 car2 = new PoliceCar2();
//		car2.cautionSound();
//		car2 = new FireCar2();
//		car2.cautionSound();
		
		SoundMaker soundMaker = new SoundMaker();
		
		Car2 car2 = new PoliceCar2();
//		Car2 car2 = new FireCar2();
		
		soundMaker.sound(car2);
		
	}
}
