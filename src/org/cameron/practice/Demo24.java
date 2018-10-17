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
		
		String content = "hello我是中国人";
		File file2 = new File("X:\\Java\\Holiday\\x.txt");
		char[] c = content.toCharArray();// 将字符串转换为字符数组
		try {
			FileWriter fw = new FileWriter(file2);// 文件字符输出流
			fw.write(c);
			fw.close();
			
			FileReader fr = new FileReader(file2);// 文件字符输入流
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
