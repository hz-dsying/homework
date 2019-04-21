package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String cc = "aA";
		Scanner console = new Scanner(System.in);
		String str = "";
		for (int i = 0; i < 5; i++){
			int num1 = (int) (Math.random()*2);
			int num = (int) (Math.random()*27);
			str = str + (char)(cc.charAt(num1)+num);
		}
		System.out.println("验证码为：" + str);
		System.out.println("请输入该验证码：");
		String ans = console.nextLine();
		str = str.toUpperCase();
		ans = ans.toUpperCase();
		if (str.equals(ans)){
			System.out.println("验证码正确");
		}else{
			System.out.println("验证码错误");
		}
	}
	
}
