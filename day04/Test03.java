package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args){
        //创建一个List集合存放元素"one","two","three","four"
        List list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        //获取集合第二个元素并输出
        System.out.println(list.get(1));
        //将集合第三个元素设置为"3"
        list.set(2,3);
        //在集合第二个位置上插入元素"2"
        list.add(1,2);
        //删除集合第三个元素
        list.remove(2);
    }
}
