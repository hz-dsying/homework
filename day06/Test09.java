package day06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        OutputStream fos = new FileOutputStream("HomeWork/src/day06/note.txt");
        while (!str.equals("exit")){
            fos.write(str.getBytes());
            fos.write("\n".getBytes());
            str = console.nextLine();
        }
        fos.close();
    }
	
}
