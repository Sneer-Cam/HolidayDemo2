package org.cameron.practice;

import java.util.HashSet;
import java.util.Iterator;

public class Demo29 {

	public static void main(String[] args) {// 无序且不保证顺序
		HashSet<String> hashSet = new HashSet<String>();// ctrl+o查看方法 
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("3");
		
		Iterator<String> iterator = hashSet.iterator();// 返回一个对应的迭代器
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
