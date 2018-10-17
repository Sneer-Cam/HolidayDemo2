package org.cameron.practice;

public class Demo12 {
	public static void main(String[] args) {
//		Person3 person = new Men(); 
//		
//		Person3 person2;
//		Men men = new Men();
//		person2 = men;
		
		Person3 person = null;
		
		American tom = new American();
		person = tom;
		person.height = 187;
		person.showBodyMess();
		person.mustDoingThing();
		
		Chinese zhangsan = new Chinese();
		person = zhangsan;
		zhangsan = (Chinese) person;
		person.height = 180;
		person.showBodyMess();
		person.mustDoingThing();
		zhangsan.speakChinese();
	}

}
