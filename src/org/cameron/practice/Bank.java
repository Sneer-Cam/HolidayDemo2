package org.cameron.practice;

public class Bank {// Demo18
	void income(int in, int out) throws BankException{
		if (in<0 || out>0) {
			throw new BankException();
		}else {
			System.out.println("你的操作是正确的");
		}
	}
}
