package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        File file = new File("HomeWork/src/day06/" + str);
        if (file.exists() && file.isDirectory()){
            System.out.println("该目录已经存在");
            String ss = str + "_副本1" ;
            file = new File("HomeWork/src/day06/" + ss);
            while (file.exists() && file.isDirectory()){
                String s1 = ss.substring(0, str.lastIndexOf('本')+1);
                String s2 = ss.substring(str.lastIndexOf('本')+1);
                int num = Integer.valueOf(s2) + 1;
                ss = s1 + String.valueOf(num);
                file = new File("HomeWork/src/day06/" + ss);
            }
            file.mkdir();
            System.out.println("已创建副本 " + file.getName());
        }else {
            file.mkdir();
            System.out.println("已创建目录 " + file.getName());
        }
    }

}
