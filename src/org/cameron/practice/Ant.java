package org.cameron.practice;

public class Ant extends Thread {// Demo31
	Cake cake;
	public Ant(String name, Cake cake) {
		this.cake = cake;
		setName(name);
	}
	
	@Override
	public void run() {
		while(true){// ��Զѭ��
			int n = 2;
			System.out.println(getName()+"��"+n+"�˵���");
			cake.lost(n);
			System.out.println(getName()+"���ֵ��⻹ʣ��"+cake.getSize()+"��");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (cake.getSize()<=0) {
				System.out.println(getName()+"�Ѿ���������״̬��");
				return;
			}
		}
	}
}
