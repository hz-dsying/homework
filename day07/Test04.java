package day07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("HomeWork");
        File[] fs = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".obj");
            }
        });
        List<Emp> list = new ArrayList<Emp>();
        for (int i = 0; i < fs.length; i++){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fs[i]));
            Emp emp = (Emp) ois.readObject();
            list.add(emp);
        }
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        for (Emp emp : list){
            System.out.println(emp);
        }
    }

}
