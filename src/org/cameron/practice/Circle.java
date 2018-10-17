package org.cameron.practice;

public class Circle {// Demo10
	double radius, area;

	void setRadius(double r) {
		radius = r;
	}

	double getArea() {
		area = 3.14 * radius * radius;
		return area;
	}
}
