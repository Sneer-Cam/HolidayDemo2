package org.cameron.practice;

import java.io.File;
import java.io.IOException;

public class Demo22 {

	public static void main(String[] args) {
		File file = new File("X:\\Java\\Holiday\\a.txt");// ��ȡ�ļ�
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		
//		File file2 = new File("X:\\Java\\Holiday", "b.txt");// �������ļ�
//		if (!file2.exists()) {
//			try {
//				file2.createNewFile();
//				System.out.println("�����ļ��ɹ�����");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		File file3 = new File("X:\\Java\\Holiday\\new");// ������Ŀ¼
//		file3.mkdir();
		
		File file4 = new File("X:\\Java\\Holiday");// ���˺�׺��Ϊtxt���ļ�
		FileAccept fileAccept = new FileAccept();
		String[] fileNames = file4.list(fileAccept);
		for (String name:fileNames) {
			System.out.println("\n"+name);
		}
	}

}
