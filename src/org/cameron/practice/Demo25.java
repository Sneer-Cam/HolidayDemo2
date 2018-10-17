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
		
		String[] content = {"我喜欢1D","我喜欢梦龙","我喜欢共和","我喜欢酷玩","他们也喜欢我/不存在的"};
		File file2 = new File("X:\\Java\\Holiday\\v.txt");
		try {
			FileWriter fw = new FileWriter(file2);// 从底开始写
			BufferedWriter bw = new BufferedWriter(fw);// 缓冲输入流
			for (String str:content) {
				bw.write(str);
				bw.newLine();
			}
			bw.close();// 从高开始关
			fw.close();
			
			FileReader fr = new FileReader(file2);// 缓冲输出流
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
