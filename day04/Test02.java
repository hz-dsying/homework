package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args){
        //创建一个集合，存放元素"1","$","2","$","3","$","4"
        Collection list = new ArrayList();
        list.add("1");
        list.add("$");
        list.add("2");
        list.add("$");
        list.add("3");
        list.add("$");
        list.add("4");
        //使用迭代器遍历集合，并在过程中删除所有的"$"
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            if (iterator.next().equals("$")){
                iterator.remove();
            }
        }
        //最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
        iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
