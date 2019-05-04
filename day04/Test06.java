package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args){
        //创建一个字符串数组:{"one","two","three"}
        String[] ss = {"one","two","three"};
        //然后将该数组转换为一个List集合
        List list = Arrays.asList(ss);
        System.out.println(list);
    }

}
