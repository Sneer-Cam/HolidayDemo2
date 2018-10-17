package org.cameron.practice;

public class Ant extends Thread {// Demo31
	Cake cake;
	public Ant(String name, Cake cake) {
		this.cake = cake;
		setName(name);
	}
	
	@Override
	public void run() {
		while(true){// 永远循环
			int n = 2;
			System.out.println(getName()+"吃"+n+"克蛋糕");
			cake.lost(n);
			System.out.println(getName()+"发现蛋糕还剩下"+cake.getSize()+"克");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (cake.getSize()<=0) {
				System.out.println(getName()+"已经进入死亡状态了");
				return;
			}
		}
	}
}
