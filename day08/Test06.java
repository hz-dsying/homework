package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 * 
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("HomeWork/src/day08/emp.txt", true)));
            System.out.println("请输入员工信息：");
            Scanner console = new Scanner(System.in);
            String str = console.nextLine();
            while (true){
                String[] every = str.split(",|，");
                String name = every[0];
                int age = Integer.parseInt(every[1]);
                String gender = every[2];
                if (!name.matches("[a-zA-Z]{1,20}") || !(age >= 0 && age <= 100) || !gender.matches("[男女]{1}")){
                    System.out.println("要求用户名长度在1-20个字符之间且必须是英文，" +
                            "年龄在0-100之间的整数,性别只能是:\"男\"或\"女\",请重新输入员工信息");
                    str = console.nextLine();
                }else {
                    pw.println(str);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }

    }

}
