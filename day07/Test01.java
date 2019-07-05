package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("HomeWork/src/day07/myfile.txt");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
        int len = -1;
        byte[] bs = new byte[1024];
        while ((len = fis.read(bs)) != -1){
            fos.write(bs, 0, len);
        }
    }

}
