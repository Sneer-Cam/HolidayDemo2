package org.cameron.practice;

public class Teacher implements Listen<Violin>{// Demo27

	@Override
	public void listen(Violin e) {
		e.pull();
	}

}
