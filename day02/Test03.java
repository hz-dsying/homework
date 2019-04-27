package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        //  \.
        String[] ss = str.split("\\.");
        for (int i = 0; i < ss.length; i++){
            System.out.println(ss[i]);
        }
    }
}
