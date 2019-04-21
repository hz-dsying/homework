package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		System.out.println(parseInt(str));
	}
	public static int parseInt(String str){
		// 最后要生成的数字
		int num = 0;
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
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		switch (flag){
			case 0:num = num1 + num2;break;
			case 1:num = num1 - num2;break;
			case 2:num = num1 * num2;break;
			case 3:num = num1 / num2;break;
		}
		return num;
	}
}








