package org.cameron.practice;

public class Ladder {// Demo9
	double top;// 实例变量
	static double bottom;// 类变量
	
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
