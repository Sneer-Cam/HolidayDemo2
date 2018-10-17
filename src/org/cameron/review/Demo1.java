package org.cameron.review;

public class Demo1 {

	public static void main(String[] args) {
		int score[] = { 50, 60, 70, 80, 90 };
		int max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("本次考试中的最高分是：" + max);
	}

}
