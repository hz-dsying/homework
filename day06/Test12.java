package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws ParseException, IOException {
        File file = new File("HomeWork/src/day06/");
        File[] fs = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".emp");
            }
        });
        Map<String, Emp> map = new HashMap<String, Emp>();
        for (int i = 0; i < fs.length; i++){
            BufferedReader isr = new BufferedReader(new InputStreamReader(new FileInputStream(fs[i])));
            String str = isr.readLine();
            String[] every = str.split(",|，");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(every[4]);
            map.put(every[0], new Emp(every[0], Integer.parseInt(every[1]), every[2], Integer.parseInt(every[3]), date));
        }
        System.out.println(map);
        Set set = map.keySet();
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        if (set.contains(s)){
            Emp emp = map.get(s);
            String name = emp.getName();
            int age = emp.getAge();
            int salary = emp.getSalary();
            Date hiredate = emp.getHiredate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(hiredate);
            String infor = name + "," + age + "," + salary + "," + cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE);
            System.out.println(infor);
            System.out.println("入职20周年纪念日派对日期:");
            // 入职20周年的纪念日当周的周六的日期
            cal.add(Calendar.YEAR, 20);
            cal.set(Calendar.DAY_OF_WEEK, 7);
            infor = cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH)+1) + "-" + cal.get(Calendar.DATE);
            System.out.println(infor);
        }else {
            System.out.println("查无此人");
        }
    }

}
