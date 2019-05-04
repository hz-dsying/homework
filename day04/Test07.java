package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args){
        //创建一个List集合，并存放10个随机数
        List list = new ArrayList();
        for (int i = 0; i < 10; i++){
            int num = (int) (Math.random()*100);
            list.add(num);
        }
        System.out.println(list);
        //排序
//        Integer[] aa = (Integer[]) list.toArray(new Integer[list.size()]);
//        for (int i = 0; i < list.size()-1; i++){
//            for (int j = i + 1; j < list.size(); j++){
//                if (aa[i] > aa[j]){
//                    int temp = aa[i];
//                    aa[i] = aa[j];
//                    aa[j] = temp;
//                }
//            }
//        }
//        list = Arrays.asList(aa);

        Collections.sort(list);
        System.out.println(list);

    }

}
