package org.cameron.practice;

import java.io.File;
import java.io.IOException;

public class Demo22 {

	public static void main(String[] args) {
		File file = new File("X:\\Java\\Holiday\\a.txt");// 读取文件
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		
//		File file2 = new File("X:\\Java\\Holiday", "b.txt");// 创建新文件
//		if (!file2.exists()) {
//			try {
//				file2.createNewFile();
//				System.out.println("创建文件成功！！");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		File file3 = new File("X:\\Java\\Holiday\\new");// 创建新目录
//		file3.mkdir();
		
		File file4 = new File("X:\\Java\\Holiday");// 过滤后缀名为txt的文件
		FileAccept fileAccept = new FileAccept();
		String[] fileNames = file4.list(fileAccept);
		for (String name:fileNames) {
			System.out.println("\n"+name);
		}
	}

}
