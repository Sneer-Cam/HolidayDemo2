package org.cameron.practice;

public class Demo21 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();// ��һ������׷�ӵ���ǰStringBuffer������
		buffer.append("��ϲ��");
		buffer.append(123);
		buffer.append('��');
		buffer.append(12.3);
		
		buffer.insert(3, "����");
		
		System.out.println(buffer.toString());
		
		StringBuffer buffer2 = buffer.reverse();// ��ת
		System.out.println(buffer2.toString());
		
		buffer.replace(2, 4, "�������滻��");
		System.out.println(buffer.toString());
//		char c = buffer.charAt(5);
//		System.out.println(c);
	}

}
