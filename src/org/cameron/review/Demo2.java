package org.cameron.review;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int avg, sum = 0;
		Scanner reader = new Scanner(System.in);
		int score[] = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.println("�������" + (i + 1) + "λѧ���ĳɼ�Ϊ��");
			score[i] = reader.nextInt();
			sum = sum + score[i];
		}
		avg = sum / score.length;
		System.out.println(score.length + "λͬѧ��ƽ����Ϊ��" + avg);
	}

}
