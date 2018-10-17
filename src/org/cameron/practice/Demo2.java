package org.cameron.practice;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner inputHeight = new Scanner(System.in);
		System.out.println("请输入您的身高！！");
		int height = inputHeight.nextInt();
		Scanner inputWeight = new Scanner(System.in);
		System.out.println("请输入您的体重！！");
		float weight = inputWeight.nextFloat();
		float coefficient = (height - 100) / weight;
		System.out.println("您的身高为：" + height + "\n" + "您的体重为：" + weight + "\n"
				+ "您的健康系数为：" + coefficient);
	}

}
