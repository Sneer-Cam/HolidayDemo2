package org.cameron.review;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int avg, sum = 0;
		Scanner reader = new Scanner(System.in);
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第" + (i + 1) + "位学生的成绩为：");
			score[i] = reader.nextInt();
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println(score.length + "位同学的平均分为：" + avg);
	}

}
