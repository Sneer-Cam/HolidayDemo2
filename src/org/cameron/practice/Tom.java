package org.cameron.practice;

public class Tom implements Test{// Demo15

	@Override
	public int getSum(int x) {
		int sum = 0;
		
		for (int i = 1; i <= x; i++) {
			sum+=i;
		}
		return sum;
	}

}
