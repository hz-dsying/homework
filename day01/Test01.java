package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		System.out.println("第1题");
		test1(str);
		System.out.println("第2题");
		test2(str);
		System.out.println("第3题");
		test3(str);
		System.out.println("第4题");
		test4(str);
		System.out.println("第5题");
		test5(str);
		System.out.println("第6题");
		String str1 = "  Hello   ";
		test6(str1);
		System.out.println("第7题");
		test7(str);
		System.out.println("第8题");
		test8(str);
		System.out.println("第9题");
		test9(str);
	}
	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
	public static void test1(String str){
		System.out.println(str.length());
	}
	/**
	 * 当前方法实现:2:输出"HelloWorld"中"o"的位置
	 */
	public static void test2(String str){
		char[] cs = str.toCharArray();
		for(int i = 0; i < cs.length; i++){
			if(cs[i] == 'o'){
				System.out.println(i);
			}
		}
	}
	/**
	 * 当前方法实现:3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
	 */
	public static void test3(String str){
		System.out.println(str.indexOf('o',5));
	}
	/**
	 * 当前方法实现:4:截取"HelloWorld"中的"Hello"并输出
	 */
	public static void test4(String str){
		System.out.println(str.substring(0,5));
	}
	/**
	 *当前方法实现:5:截取"HelloWorld"中的"World"并输出
	 */
	public static void test5(String str){
		System.out.println(str.substring(5));
	}
	/**
	 *当前方法实现:6:将字符串"  Hello   "中两边的空白去除后输出
	 */
	public static void test6(String str){
		System.out.println(str.trim());
	}
	/**
	 * 当前方法实现:7:输出"HelloWorld"中第6个字符"W"
	 */
	public static void test7(String str){
		System.out.println(str.charAt(5));
	}
	/**
	 * 当前方法实现:8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的
	 */
	public static void test8(String str){
		System.out.println((str.endsWith("ld")) && (str.startsWith("h")));
	}
	/**
	 * 当前方法实现:9:将"HelloWorld"分别转换为全大写和全小写并输出
	 */
	public static void test9(String str){
		String s1 = str.toUpperCase();
		String s2 = str.toLowerCase();
		System.out.println("全大写：" + s1);
		System.out.println("全小写：" + s2);
	}
}
