package org.cameron.practice;

public class Demo1 {
	public static void main(String[] args) {
		char ch1 = 'һ', ch2 = 'ȭ';//unicode���ַ�ת��(0~65536)
		System.out.println(ch1 + "��unicode���е�λ��" + (int) ch1);
		System.out.println(ch2 + "��unicode���е�λ��" + (int) ch2);

		int p1 = 969, p2 = 23333;
		System.out.println("��" + p1 + "��λ���ϵ��ַ���" + (char) p1);
		System.out.println("��" + p2 + "��λ���ϵ��ַ���" + (char) p2);
	}
}
