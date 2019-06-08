package day06;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("HomeWork/src/day06/");
        File[] fs = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".emp");
            }
        });
        List<Emp> list = new ArrayList<Emp>();
        for (int i = 0; i < fs.length; i++){
            BufferedReader isr = new BufferedReader(new InputStreamReader(new FileInputStream(fs[i])));
            String str = isr.readLine();
            Emp emp = new Emp();
            String[] every = str.split(",|，");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(every[4]);
            list.add(new Emp(every[0], Integer.parseInt(every[1]), every[2], Integer.parseInt(every[3]), date));
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
