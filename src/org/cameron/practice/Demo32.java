package org.cameron.practice;

public class Demo32 {

	public static void main(String[] args) {
		House house = new House();
		house.setCake(10);
		
		Thread antRed = new Thread(house);
		antRed.setName("������");
		Thread antBlack = new Thread(house);
		antBlack.setName("������");
		antRed.start();
		antBlack.start();
	}

}
