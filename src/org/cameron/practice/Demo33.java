package org.cameron.practice;

public class Demo33 {

	public static void main(String[] args) {
		Bank2 bank = new Bank2();
		bank.setMoney(46500000);
		System.out.println("�������ϻ���46500000");
		
		Thread accountant = new Thread(bank);
		accountant.setName("���");
		Thread cashier = new Thread(bank);
		cashier.setName("����");
		
		accountant.start();
		cashier.start();
	}

}
