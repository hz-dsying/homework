package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件，该文件应当是Test07程序生成的文件，然后将该文件中所有字符读取
 * 出来，并以UTF-8编码写入到另一个文件中，实现文件转码工作，该文件取名格式:原文件名_utf.txt。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String ss = console.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("HomeWork/src/day07/" + ss)));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("HomeWork/src/day07/" + ss + "_utf.txt"), "utf-8"));
        String str = br.readLine();
        while (str != null){
            pw.println(str);
            str = br.readLine();
        }
        br.close();
        pw.close();
    }

}
