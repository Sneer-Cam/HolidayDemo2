package org.cameron.practice;

public class Demo26 {

	public static void main(String[] args) {
		ShowObject<Dog> showDog = new ShowObject<Dog>();
		ShowObject<Cat> showCat = new ShowObject<Cat>();
		
		showDog.showMessage(new Dog());
		showCat.showMessage(new Cat());
	}

}
