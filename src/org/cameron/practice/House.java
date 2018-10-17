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
				System.out.println(Thread.currentThread().getName()+"已经进入死亡状态了");
				return;
			}
			
			cake = cake - m;
			System.out.println(Thread.currentThread().getName()+"吃了"+m+"克蛋糕");
			System.out.println(Thread.currentThread().getName()+"发现蛋糕还剩下"+cake+"克");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
