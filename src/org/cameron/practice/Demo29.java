package org.cameron.practice;

import java.util.HashSet;
import java.util.Iterator;

public class Demo29 {

	public static void main(String[] args) {// �����Ҳ���֤˳��
		HashSet<String> hashSet = new HashSet<String>();// ctrl+o�鿴���� 
		hashSet.add("1");
		hashSet.add("2");
		hashSet.add("3");
		hashSet.add("3");
		
		Iterator<String> iterator = hashSet.iterator();// ����һ����Ӧ�ĵ�����
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}

}
