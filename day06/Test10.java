package day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] ss = str.split(",|，");
        Emp emp = new Emp();
        emp.setName(ss[0]);
        emp.setAge(Integer.parseInt(ss[1]));
        emp.setGender(ss[2]);
        emp.setSalary(Integer.parseInt(ss[3]));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(ss[4]);
        emp.setHiredate(date);
        str = emp.toString();
        String address = "HomeWork/src/day06/" + ss[0] + ".emp";
        OutputStream fos = new FileOutputStream(address);
        fos.write(str.getBytes());
    }
	
	
}
