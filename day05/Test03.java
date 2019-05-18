package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        String[] all = s.split(";|；");
        List list = new ArrayList();
        for (int i = 0; i < all.length; i++){
            Emp emp = new Emp();
            String[] every = all[i].split(",|，");
            emp.setName(every[0]);
            emp.setAge(Integer.parseInt(every[1]));
            emp.setGender(every[2]);
            emp.setSalary(Integer.parseInt(every[3]));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(every[4]);
            emp.setHiredate(date);
            list.add(emp);
        }
        Collections.sort(list);
        for (Object emp : list){
            System.out.println(emp);
        }
        System.out.println();
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return -o1.getHiredate().compareTo(o2.getHiredate());
            }
        });
        for (Object emp : list){
            System.out.println(emp);
        }
    }
}
