package day03;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        // \d{18}  \d{17}X
        while (!(str.matches("\\d{18}")||str.matches("\\d{17}X"))){
            System.out.println("格式有误，请重新输入：");
            str = console.nextLine();
        }
        Calendar cal = Calendar.getInstance();
        int y = Integer.valueOf(str.substring(6,10));
        int m = Integer.valueOf(str.substring(10,12))-1;
        int d = Integer.valueOf(str.substring(12,14));
        cal.set(y, m, d);
        cal.add(Calendar.YEAR, 20);
        cal.set(Calendar.DAY_OF_WEEK, 4);
        System.out.println(cal.getTime());

    }

}
