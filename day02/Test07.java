package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        float num = 0;
        int a = 0;
        int flag = 0;
        if (str.contains("+")){
            a = str.indexOf("+");
        }else if (str.contains("-")){
            a = str.indexOf("-");
            flag = 1;
        }else if (str.contains("*")){
            a = str.indexOf("*");
            flag = 2;
        }else if (str.contains("/")){
            a = str.indexOf("/");
            flag = 3;
        }
        String str1 = str.substring(0,a);
        String str2 = str.substring(a+1);
        float num1 = Float.parseFloat(str1);
        float num2 = Float.parseFloat(str2);
        switch (flag){
            case 0:num = num1 + num2;break;
            case 1:num = num1 - num2;break;
            case 2:num = num1 * num2;break;
            case 3:num = num1 / num2;break;
        }
        System.out.println(num);
    }
}
