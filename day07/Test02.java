package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file = new File("HomeWork/src/day07/myfile.txt");
        InputStream is = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream os = new FileOutputStream("myfile_cp2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int len = -1;
        byte[] bs = new byte[1024];
        while ((len = bis.read(bs)) != -1){
            bos.write(bs, 0, len);
        }
        bis.close();
        bos.close();
    }

}
