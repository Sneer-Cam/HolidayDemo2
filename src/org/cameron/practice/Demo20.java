package org.cameron.practice;

public class Demo20 {
	public static void main(String[] args) {
//		String string = "12.78";// 字符串转换为其他类型
//		double d = Double.parseDouble(string);
//		System.out.println(d);
		
//		int a = 123;// 其他类型转换为字符串
//		double b = 12.3;
//		System.out.println(String.valueOf(a));
//		System.out.println(String.valueOf(b));
		
		String string = "Hello World";// 字符串转换为字符数组
		char[] c = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);// 遍历字符数组
		}
	}

}
