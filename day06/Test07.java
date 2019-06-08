package day06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String filename = console.nextLine();
//		copy1(filename);
		copy2(filename);
	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public static void copy1(String name) throws IOException {
		String str1 = "HomeWork/src/day06/" + name;
		RandomAccessFile rf1 = new RandomAccessFile(str1, "rw");
		String s1 = name.substring(0, name.lastIndexOf('.'));
		String s2 = name.substring(name.lastIndexOf('.'));
		String str2 = "HomeWork/src/day06/" + s1 + "_copy" + s2;
		RandomAccessFile rf2 = new RandomAccessFile(str2, "rw");
		int b = -1;
		while((b = rf1.read()) != -1){
			rf2.write(b);
		}
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public static void copy2(String name) throws IOException {
		String str1 = "HomeWork/src/day06/" + name;
		RandomAccessFile rf1 = new RandomAccessFile(str1, "rw");
		String s1 = name.substring(0, name.lastIndexOf('.'));
		String s2 = name.substring(name.lastIndexOf('.'));
		String str2 = "HomeWork/src/day06/" + s1 + "_copy" + s2;
		RandomAccessFile rf2 = new RandomAccessFile(str2, "rw");
		int len = -1;
		byte[] bs = new byte[1024];
		while ((len = rf1.read(bs)) != -1){
			rf2.write(bs, 0, len);
		}

	}
}
