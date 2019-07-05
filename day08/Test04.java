package day08;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 使用异常捕获机制完成下述读取操作
 * 读取emp.txt文件，并将每个员工信息读取出来，以一个Emp实例保存，然后将
 * 这些Emp实例存入到一个Map集合中。其中key为字符串，是该员工名字，而value
 * 是该Emp实例。
 * 存入后，要求用户输入一个员工的名字,如:张三
 * 若该员工存在则输出该员工所有信息(Emp的toString方法返回的字符串)
 * 输入的员工名若是英文，不要求区分大小写。
 * 若输入的员工名字不存在，则显示"查无此人"
 * 
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args){
        Map<String, Emp> map = new HashMap<String, Emp>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("HomeWork/src/day08/emp.txt" )));
            String str = null;
            while ((str = br.readLine()) != null){
                String[] every = str.split(",| , ");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(every[4]);
                map.put(every[0], new Emp(every[0], Integer.parseInt(every[1]), every[2], Integer.parseInt(every[3]), date));
            }
            Set<String> set = map.keySet();
            Scanner console = new Scanner(System.in);
            str = console.nextLine();
            boolean flag = true;
            for (String key : set){
                if (key.equalsIgnoreCase(str)){
                    System.out.println(map.get(key).toString());
                    flag = false;
                }
            }
            if (flag){
                System.out.println("查无此人");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

    }

}
