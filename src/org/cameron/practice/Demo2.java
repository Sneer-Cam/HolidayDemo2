package org.cameron.practice;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner inputHeight = new Scanner(System.in);
		System.out.println("������������ߣ���");
		int height = inputHeight.nextInt();
		Scanner inputWeight = new Scanner(System.in);
		System.out.println("�������������أ���");
		float weight = inputWeight.nextFloat();
		float coefficient = (height - 100) / weight;
		System.out.println("�������Ϊ��" + height + "\n" + "��������Ϊ��" + weight + "\n"
				+ "���Ľ���ϵ��Ϊ��" + coefficient);
	}

}
