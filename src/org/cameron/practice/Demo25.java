package org.cameron.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo25 {

	public static void main(String[] args) {
		File file = new File("X:\\Java\\Holiday", "v.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String[] content = {"��ϲ��1D","��ϲ������","��ϲ������","��ϲ������","����Ҳϲ����/�����ڵ�"};
		File file2 = new File("X:\\Java\\Holiday\\v.txt");
		try {
			FileWriter fw = new FileWriter(file2);// �ӵ׿�ʼд
			BufferedWriter bw = new BufferedWriter(fw);// ����������
			for (String str:content) {
				bw.write(str);
				bw.newLine();
			}
			bw.close();// �Ӹ߿�ʼ��
			fw.close();
			
			FileReader fr = new FileReader(file2);// ���������
			BufferedReader br = new BufferedReader(fr);
			String string = null;
			while ((string = br.readLine()) != null) {
				System.out.println(string);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
