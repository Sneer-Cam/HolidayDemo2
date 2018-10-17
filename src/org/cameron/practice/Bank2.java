package org.cameron.practice;

public class Bank2 implements Runnable {// Demo33
	int money;

	public void setMoney(int n) {
		money = n;
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("���")) {
			saveOrTake(300000);
		} else if (Thread.currentThread().getName().equals("����")) {
			saveOrTake(600);
		}
	}

	public synchronized void saveOrTake(int m) {
		if (Thread.currentThread().getName().equals("���")) {
			for (int i = 0; i < 3; i++) {
				money = money + m / 3;
				System.out.println(Thread.currentThread().getName() + "����" + m
						/ 3 + ",���ϻ���" + money + ",��Ϣһ����ٴ�");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (Thread.currentThread().getName().equals("����")) {
			for (int i = 0; i < 3; i++) {
				money = money - m / 3;
				System.out.println(Thread.currentThread().getName() + "ȡ��" + m
						/ 3 + ",���ϻ���" + money + ",��Ϣһ�����ȡ");
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
