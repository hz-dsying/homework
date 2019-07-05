package day08;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为short,长度为2个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile("HomeWork/src/day08/emp.dat", "rw");
            byte[] bs = new byte[32];
            int len = -1;
            List<Emp> list = new ArrayList<Emp>();
            String name;
            int age;
            String gender;
            int salary;
            Date hiredate;
            while((len = raf.read(bs)) != -1){
                name = new String(bs, "UTF-8");
                age = raf.readShort();
                bs = new byte[10];
                raf.read(bs);
                gender = new String(bs, "UTF-8");
                salary = raf.readInt();
                hiredate = new Date(raf.readLong());
                list.add(new Emp(name, age, gender, salary, hiredate));
                bs = new byte[32];
            }
            Collections.sort(list, new Comparator<Emp>() {
                @Override
                public int compare(Emp o1, Emp o2) {
                    return o2.getHiredate().compareTo(o1.getHiredate());
                }
            });
            for (Emp emp : list){
                System.out.println(emp.toString());
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }finally {
            raf.close();
        }
    }

}
