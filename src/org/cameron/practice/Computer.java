package org.cameron.practice;

public class Computer {//Demo8
	public int getSum(int... x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
}
