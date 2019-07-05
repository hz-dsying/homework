package day08;

import java.io.*;

/**
 * 对myfile.txt文件进行复制操作，要求使用异常捕获
 * 机制对流的异常进行捕获和处理，finally中
 * 要将流关闭
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("HomeWork/src/day08/myfile.txt");
            os = new FileOutputStream("HomeWork/src/day08/myfile_copy.txt");
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] bs = new byte[1024];
            int len = -1;
            while ((len = bis.read(bs)) != -1){
                bos.write(bs, 0, len);
            }
            bis.close();
            bos.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
    }

}
