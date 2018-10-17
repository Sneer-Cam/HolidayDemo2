package org.cameron.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo30 {
	public static void main(String[] args){
// 主要用于存储键值对(以键值对的形式来存储数据)，根据键得到值，因此不允许键重复，但允许值重复，最多只允许一条记录的键为null，允许多条记录的值为null		
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
