package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] all = str.split(";|；");
        List list = new ArrayList();
        for (int i = 0; i < all.length; i++){
            String[] every = all[i].split(",|，");
            Emp emp = new Emp();
            emp.setName(every[0]);
            emp.setAge(Integer.parseInt(every[1]));
            emp.setGender(every[2]);
            emp.setSalary(Integer.parseInt(every[3]));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(every[4]);
            emp.setHiredate(date);
            list.add(emp);
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //转正仪式日期为:入职3个月的当周周五
        for (int i = 0; i < list.size(); i++){
            Emp emp = (Emp) list.get(i);
            StringBuilder sb = new StringBuilder("");
            sb.append(emp.getName() + "转正日期为：");
            Calendar cal = Calendar.getInstance();
            cal.setTime(emp.getHiredate());
            cal.add(Calendar.MONTH, 3);
            cal.set(Calendar.DAY_OF_WEEK, 6);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sb.append(sdf.format(cal.getTime()));
            System.out.println(sb);
        }
    }

}
