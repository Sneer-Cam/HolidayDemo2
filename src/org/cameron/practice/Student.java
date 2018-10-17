package org.cameron.practice;

public class Student implements Listen<Piano>{// Demo27

	@Override
	public void listen(Piano e) {
		e.play();
	}

}
