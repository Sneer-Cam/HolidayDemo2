package org.cameron.practice;

public class Demo13 {
	public static void main(String[] args){
		Car car = new PoliceCar();// ��ת�Ͷ���
		car.cautionSound();
		car = new AmbulanCar();
		car.cautionSound();
		car = new FireCar();
		car.cautionSound();
	}
}
