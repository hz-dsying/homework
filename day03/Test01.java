package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("当前系统时间：" + date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE,3);
        date = cal.getTime();
        System.out.println("3天后当前系统时间：" + date);
    }

}
