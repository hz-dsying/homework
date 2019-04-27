package day02;

import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] all = str.split(";|；");
//        for(int i = 0; i < all.length; i++){
//            System.out.println(all[i]);
//        }
        Person[] person = new Person[all.length];
        String[] every = new String[4];
        for (int i = 0; i < all.length; i++){
           every = all[i].split(",|，");
           //System.out.println(every[0]);
            person[i]  = new Person();
           person[i].setName(every[0]);
           person[i].setAge(Integer.valueOf(every[1]));
           person[i].setGender(every[2]);
           person[i].setSalary(Integer.valueOf(every[3]));
        }
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i].toString());
        }
    }
}
