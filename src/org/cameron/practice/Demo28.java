package org.cameron.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo28 {

	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();// ÓÐÐò
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		
//		for (int i = 0; i < arrayList.size(); i++) {
//			int tmp = arrayList.get(i);
//			System.out.println(tmp);
//		}
		
		LinkedList<String> linkedList = new LinkedList<String>();// ÔÊÐí°üº¬null
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.addFirst("0");
		linkedList.removeLast();
		
		for (int i = 0; i < linkedList.size(); i++) {
			String string = linkedList.get(i);
			System.out.println(string);
		}
	}

}
