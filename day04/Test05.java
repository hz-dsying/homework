package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args){
        //创建一个List集合，并添加元素0-9
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        //将集合转换为一个Integer数组并输出数组每一个元素
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
    }

}
