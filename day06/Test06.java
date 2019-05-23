package day06;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args){
        File file = new File("src/day06");
        File[] fs = file.listFiles();
        for (File f : fs){
            System.out.println(f);
        }
    }

}
