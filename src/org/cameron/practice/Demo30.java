package org.cameron.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo30 {
	public static void main(String[] args){
// ��Ҫ���ڴ洢��ֵ��(�Լ�ֵ�Ե���ʽ���洢����)�����ݼ��õ�ֵ����˲�������ظ���������ֵ�ظ������ֻ����һ����¼�ļ�Ϊnull�����������¼��ֵΪnull		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("name", "tom");
		hashMap.put("age", "35");
		System.out.println(hashMap.get("age"));
		
		Iterator<Entry<String, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println("key="+entry.getKey()+"  "+"value="+entry.getValue());
		}
	}
}
