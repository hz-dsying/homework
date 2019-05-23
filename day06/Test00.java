package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 删除父目录（要依次删除内部所有文件/文件夹）
 */

public class Test00 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        // HomeWork/src/day06/
        File file = new File(str);
        delect(file);
    }

    public static void delect(File file) {
        if (file.isFile()){
            file.delete();
        }else{
            File[] fs = file.listFiles();
            for(File f : fs){
                delect(f);
            }
        }
        file.delete();
    }
}
