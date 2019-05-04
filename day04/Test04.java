package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        //创建一个List集合并添加元素0-9
        List list = new ArrayList();
        for (int i = 0; i < 10; i++){
            list.add(i);
        }
        //然后获取子集[3,4,5,6]
        List sub = list.subList(3,7);
        //然后将子集元素扩大10倍
        for (int i = 0; i < sub.size(); i++){
            sub.set(i, (int)sub.get(i) * 10);
        }
        //然后输出原集合
        System.out.println(list);
        //之后删除集合中的[7,8,9]
        List mm = list.subList(7,10);
        list.removeAll(mm);
        System.out.println(list);
    }

}
