package org.cameron.practice;

public class Demo15 {
	public static void main(String[] args) {
//		Tom tom = new Tom();
//		Bob bob = new Bob();
//		
//		System.out.println("tom�ļ�������"+tom.getSum(20));
//		System.out.println("bob�ļ�������"+bob.getSum(20));
		
		Test test;
		Tom tom = new Tom();
		test = tom;
		System.out.println("tom�ļ�������"+test.getSum(10));
		test = new Bob();
		System.out.println("bob�ļ�������"+test.getSum(50));
	}

}
