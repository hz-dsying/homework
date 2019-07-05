package day07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:张三,25,男,5000,2006-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        Scanner con = new Scanner(System.in);
        for (int i = 0; i < num; i++){
            String str = con.nextLine();
            String[] ss = str.split(",|，");
            Emp emp = new Emp();
            emp.setName(ss[0]);
            emp.setAge(Integer.parseInt(ss[1]));
            emp.setGender(ss[2]);
            emp.setSalary(Integer.parseInt(ss[3]));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(ss[4]);
            emp.setHiredate(date);
            File file = new File("HomeWork/" + ss[0]+".obj");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(emp);
            oos.close();

        }

    }

}
