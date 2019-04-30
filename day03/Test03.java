package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();//当前时间
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date2 = sdf.parse(str);//生日时间
        long time = (date1.getTime() - date2.getTime())/(1000l*60*60*24*7);
        System.out.println("过去了" + time + "周");
    }

}
