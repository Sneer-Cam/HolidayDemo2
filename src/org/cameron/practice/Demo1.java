package org.cameron.practice;

public class Demo1 {
	public static void main(String[] args) {
		char ch1 = '一', ch2 = '拳';//unicode表字符转换(0~65536)
		System.out.println(ch1 + "在unicode表中的位置" + (int) ch1);
		System.out.println(ch2 + "在unicode表中的位置" + (int) ch2);

		int p1 = 969, p2 = 23333;
		System.out.println("第" + p1 + "个位置上的字符是" + (char) p1);
		System.out.println("第" + p2 + "个位置上的字符是" + (char) p2);
	}
}
