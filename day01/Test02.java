package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "大家好!";
		//将"大家好!"修改为:"大家好!我是程序员!"并输出
		str = str.concat("我是程序员!");
		System.out.println(str);
		//将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
		String str1 = str.substring(0,6);
		String str2 = str.substring(6);
		str = str1.concat("优秀的").concat(str2);
		System.out.println(str);
		//再修改为:"大家好!我是牛牛的程序员!"并输出
		str = str.replace("优秀的","牛牛的");
		System.out.println(str);
		//在修改为:"我是牛牛的程序员!"并输出
		str = str.substring(4);
		System.out.println(str);
	}
}
