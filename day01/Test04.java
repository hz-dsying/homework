package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("请输入一个email地址");
		Scanner console = new Scanner(System.in);
		String str = console.nextLine();
		while (!str.contains("@")){
			System.out.println("email地址错误，请重新输入");
			str = console.nextLine();
		}
		str = str.substring(0,str.indexOf("@"));
		System.out.println(str);
	}
}
