package org.cameron.practice;

public class Demo21 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();// 将一个对象追加到当前StringBuffer对象中
		buffer.append("我喜欢");
		buffer.append(123);
		buffer.append('中');
		buffer.append(12.3);
		
		buffer.insert(3, "插入");
		
		System.out.println(buffer.toString());
		
		StringBuffer buffer2 = buffer.reverse();// 翻转
		System.out.println(buffer2.toString());
		
		buffer.replace(2, 4, "我是来替换的");
		System.out.println(buffer.toString());
//		char c = buffer.charAt(5);
//		System.out.println(c);
	}

}
