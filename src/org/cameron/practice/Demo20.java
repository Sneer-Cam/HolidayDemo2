package org.cameron.practice;

public class Demo20 {
	public static void main(String[] args) {
//		String string = "12.78";// �ַ���ת��Ϊ��������
//		double d = Double.parseDouble(string);
//		System.out.println(d);
		
//		int a = 123;// ��������ת��Ϊ�ַ���
//		double b = 12.3;
//		System.out.println(String.valueOf(a));
//		System.out.println(String.valueOf(b));
		
		String string = "Hello World";// �ַ���ת��Ϊ�ַ�����
		char[] c = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);// �����ַ�����
		}
	}

}
