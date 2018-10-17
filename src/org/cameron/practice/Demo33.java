package org.cameron.practice;

public class Demo33 {

	public static void main(String[] args) {
		Bank2 bank = new Bank2();
		bank.setMoney(46500000);
		System.out.println("银行账上还有46500000");
		
		Thread accountant = new Thread(bank);
		accountant.setName("会计");
		Thread cashier = new Thread(bank);
		cashier.setName("出纳");
		
		accountant.start();
		cashier.start();
	}

}
