package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        File file = new File("HomeWork/src/day06/" + str);
        if (file.exists()){
            System.out.println("该文件已经存在");
            String s1 = str.substring(0, str.lastIndexOf('.'));
            String s2 = str.substring(str.lastIndexOf('.'));
            String ss = s1 + "_副本1" + s2;
            file = new File("HomeWork/src/day06/" + ss);
            while (file.exists()){
                s1 = ss.substring(0, ss.lastIndexOf('本')+1);
                s2 = ss.substring(ss.lastIndexOf('.'));
                String s3 = ss.substring(ss.lastIndexOf('本')+1, ss.lastIndexOf('.'));
                int num = Integer.valueOf(s3) + 1;
                ss = s1 + String.valueOf(num) + s2;
                file = new File("HomeWork/src/day06/" + ss);
            }
            file.createNewFile();
            System.out.println("已创建副本 " + file.getName());
        }else {
            file.createNewFile();
            System.out.println("已创建文件 " + file.getName());
        }
    }

}
