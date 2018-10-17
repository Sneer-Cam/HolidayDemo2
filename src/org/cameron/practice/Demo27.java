package org.cameron.practice;

public class Demo27 {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		
		student.listen(new Piano());
		teacher.listen(new Violin());
	}

}
