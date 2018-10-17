package org.cameron.practice;

public class Demo6 {
	public enum Weekday {// Ã¶¾Ù
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}

	public static void main(String[] args) {
		Weekday day = Weekday.Friday;
		// if (day == Weekday.Friday) {
		// System.out.println(day);
		// }

		// for (Weekday week:Weekday.values()) {//±éÀúÃ¶¾Ù
		// System.out.println(week);
		// }

		switch (day) {
		case Monday:
			System.out.println("Monday");
			break;
		case Tuesday:
			System.out.println("Tuesday");
			break;
		case Wednesday:
			System.out.println("Wednesday");
			break;
		case Thursday:
			System.out.println("Thursday");
			break;
		case Friday:
			System.out.println("Friday");
			break;
		case Saturday:
			System.out.println("Saturday");
			break;
		case Sunday:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("It doesn't exist,babe");
			break;
		}
	}

}
