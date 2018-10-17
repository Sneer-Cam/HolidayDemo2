package org.cameron.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo23 {

	public static void main(String[] args) {
		File file = new File("X:\\Java\\Holiday\\a.txt");
		File file2 = new File("X:\\Java\\Holiday\\b.txt");
		byte[] b = new byte[100];
		int count = 0;
		String lord = "梦龙共和酷玩!!";
		byte[] b2 = lord.getBytes();// 将字符串转换为字节数组
		try {
			FileInputStream is = new FileInputStream(file);// 文件字节输入流
			while ((count = is.read(b)) != -1) {// 当文件读到尾部时则返回-1
				String string = new String(b, 0, count);// 将字节数组转换为字符串
				System.out.println(string);
			}
			is.close();
			
			FileOutputStream os = new FileOutputStream(file2);// 文件字节输出流
			os.write(b2);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
