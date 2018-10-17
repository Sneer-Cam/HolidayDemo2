package org.cameron.practice;

public class Demo18 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		try {
			bank.income(-50000000, 1);
		} catch (BankException e) {
			e.showMessage();
		}
	}

}
