package org.cameron.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo24 {

	public static void main(String[] args) {
		File file = new File("X:\\Java\\Holiday", "x.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String content = "hello�����й���";
		File file2 = new File("X:\\Java\\Holiday\\x.txt");
		char[] c = content.toCharArray();// ���ַ���ת��Ϊ�ַ�����
		try {
			FileWriter fw = new FileWriter(file2);// �ļ��ַ������
			fw.write(c);
			fw.close();
			
			FileReader fr = new FileReader(file2);// �ļ��ַ�������
			char[] c2 = new char[100];
			int count = 0;
			while ((count = fr.read(c2)) != -1) {
				String string = new String(c2, 0, count);
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
