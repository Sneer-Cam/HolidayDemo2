package org.cameron.practice;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Plz input a number!!");
		int input = reader.nextInt();
		switch (input) {
		case 1:
			System.out.println("You input 1");
			break;
		case 2:
			System.out.println("You input 2");
			break;
		case 3:
			System.out.println("You input 3");
			break;
		case 4:
			System.out.println("You input 4");
			break;
		case 5:
			System.out.println("You input 5");
			break;
		default:
			System.out.println("You input an another number!!");
			break;
		}
	}

}
