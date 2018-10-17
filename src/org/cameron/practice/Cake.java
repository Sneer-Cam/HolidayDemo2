package org.cameron.practice;

public class Cake {// Demo31
	int size;
	
	public void setSize(int n){
		size = n;
	}
	
	public int getSize(){
		return size;
	}
	
	public void lost(int m){
		if (size > 0) {
			size = size - m;
		}
	}
}
