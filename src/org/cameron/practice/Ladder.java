package org.cameron.practice;

public class Ladder {// Demo9
	double top;// ʵ������
	static double bottom;// �����
	
	public double getTop() {
		return top;
	}
	public void setTop(double top) {
		this.top = top;
	}
	public static double getBottom() {
		return bottom;
	}
	public static void setBottom(double bottom) {
		Ladder.bottom = bottom;
	}
}
