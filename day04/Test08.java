package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        //通过控制台输入3个日期(yyyy-MM-dd格式)
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        String str2 = console.nextLine();
        String str3 = console.nextLine();
        //转换为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(str1);
        Date date2 = sdf.parse(str2);
        Date date3 = sdf.parse(str3);
        //存入集合
        List list = new ArrayList();
        list.add(date1);
        list.add(date2);
        list.add(date3);
        //对该集合排序
        Collections.sort(list);
        //输出所有日期
        System.out.println(list);
    }

}
