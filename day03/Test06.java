package day03;

import java.util.ArrayList;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args){
        ArrayList ss = new ArrayList();
        ss.add("one");
        ss.add("two");
        ss.add("three");
        System.out.println(ss.size());
        System.out.println(ss.contains("four"));
        System.out.println(ss.isEmpty());
        ss.clear();
        System.out.println(ss.size());
        System.out.println(ss.isEmpty());
    }

}
