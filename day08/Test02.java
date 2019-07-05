package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("HomeWork/src/day08/note.txt"), "gbk"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = null;
        while (true){
            str = console.nextLine();
            if (str.equals("exit")){
                break;
            }
            pw.println(str);
        }
        pw.close();
    }
	
}
