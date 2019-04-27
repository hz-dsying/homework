package day02;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args){
        String str = "123,456,789,012";
        String[] ss = str.split(",");
        for (int i = 0; i < ss.length; i++){
            System.out.println(ss[i]);
        }
    }
}
