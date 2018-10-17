package org.cameron.practice;

public class Ladder2 {// Demo10
	double top, bottom, height;

	public Ladder2(double a, double b, double h) {
		top = a;
		bottom = b;
		height = h;
	}

	double getArea() {
		return (top + bottom) * height / 2;
	}
}
