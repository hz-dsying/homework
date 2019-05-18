package day05;

import java.util.*;
import java.util.Map.Entry;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String[] ss = str.split(";|；");
        for (int i = 0; i < ss.length; i++){
            String[] every = ss[i].split(":|：");
            String k = every[0];
            Integer v = Integer.valueOf(every[1]);
            map.put(k, v);
        }
        System.out.println(map.get("物理"));
        map.put("化学", 96);
        map.remove("英语");
        // 遍历key
        Set<String> set = map.keySet();
        for (String key : set){
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("--------------------");
        // 遍历Entry
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        for (Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("--------------------");
        // 遍历value
        Collection<Integer> col = map.values();
        for (Integer value : col){
            System.out.println(value);
        }

    }

}
