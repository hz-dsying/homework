package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        //整数 \d+
        //小数 \d+\.\d+
        if (str.matches("\\d+")){
            int a = Integer.parseInt(str);
            System.out.println(a*10);
        }else if (str.matches("\\d+\\.\\d+")){
            float a = Float.parseFloat(str);
            System.out.println(a*5);
        }else {
            System.out.println("不是数字");
        }
    }
}
