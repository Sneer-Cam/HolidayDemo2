package org.cameron.practice;

public class Demo9 {
	public static void main(String[] args) {
		Ladder.bottom=100;
		Ladder ladder1 = new Ladder();
		Ladder ladder2 = new Ladder();
		ladder1.setTop(50);
		ladder2.setTop(60);
		System.out.println("ladder1的上底："+ladder1.getTop());
		System.out.println("ladder1的下底："+ladder1.getBottom());
		System.out.println("ladder2的上底："+ladder2.getTop());
		System.out.println("ladder2的下底："+ladder2.getBottom());
		
		System.out.println("1~10之和为："+Sum.getSum(1, 10));
	}

}

class Sum{
	static int getSum(int start,int end){
		int sum=0;
		for (int i = start; i < end; i++) {
			sum+=i;
		}
		return sum;
	}
}