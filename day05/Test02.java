package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args){
        Deque<Integer> dq = new LinkedList<Integer>();
        dq.push(1);
        dq.push(2);
        dq.push(3);
        dq.push(4);
        dq.push(5);
        for (Integer i : dq){
            System.out.println(i);
        }
    }


}
