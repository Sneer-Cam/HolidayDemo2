package org.cameron.practice;

public class House implements Runnable{// Demo32
	int cake;
	
	public void setCake(int c){
		cake = c;
	}
	
	@Override
	public void run() {
		int m = 2;
		while (true) {
			if (cake <= 0) {
				System.out.println(Thread.currentThread().getName()+"�Ѿ���������״̬��");
				return;
			}
			
			cake = cake - m;
			System.out.println(Thread.currentThread().getName()+"����"+m+"�˵���");
			System.out.println(Thread.currentThread().getName()+"���ֵ��⻹ʣ��"+cake+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
