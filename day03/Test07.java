package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        ArrayList ss = new ArrayList();
        String[] mess = new String[5];
        for (int i = 0; i < number; i++){
            System.out.println("请输入第" + (i+1) + "个员工信息：");
            Scanner con = new Scanner(System.in);
            String str = con.nextLine();
            mess = str.split(",|，");
            Emp emp = new Emp();
            emp.setName(mess[0]);
            emp.setAge(Integer.valueOf(mess[1]));
            emp.setGender(mess[2]);
            emp.setSalary(Integer.valueOf(mess[3]));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(mess[4]);
            emp.setHiredate(date);
            if (!isExis(ss, emp)){
                ss.add(emp);
                System.out.println("创建成功");
            }else {
                System.out.println("该员工已存在，请重新输入");
                i--;
            }
        }
        for (int i = 0; i < ss.size(); i++){
            System.out.println(ss.get(i));
        }
    }

    public static boolean isExis(ArrayList ss, Emp emp) {
        for (int i = 0; i < ss.size(); i++){
            if(emp.equals(ss.get(i))){
                return true;
            }
        }
        return false;
    }

}
