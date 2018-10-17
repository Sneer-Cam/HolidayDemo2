package org.cameron.practice;

public class Bank2 implements Runnable {// Demo33
	int money;

	public void setMoney(int n) {
		money = n;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("会计")) {
			saveOrTake(300000);
		} else if (Thread.currentThread().getName().equals("出纳")) {
			saveOrTake(600);
		}
	}

	public synchronized void saveOrTake(int m) {
		if (Thread.currentThread().getName().equals("会计")) {
			for (int i = 0; i < 3; i++) {
				money = money + m / 3;
				System.out.println(Thread.currentThread().getName() + "存入" + m
						/ 3 + ",账上还有" + money + ",休息一会儿再存");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (Thread.currentThread().getName().equals("出纳")) {
			for (int i = 0; i < 3; i++) {
				money = money - m / 3;
				System.out.println(Thread.currentThread().getName() + "取出" + m
						/ 3 + ",账上还有" + money + ",休息一会儿再取");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
