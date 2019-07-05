package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //String ss = Test05.class.getClassLoader().getResource("day07/Test04").getFile();
        //System.out.println(ss);
        File file = new File(Test05.class.getClassLoader().getResource("day07/Test05.class").getPath());
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        File file1 = new File("Homework/src/day07/Test05_copy.java");
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file1)));
        String str = null;
        while ((str = br.readLine()) != null){
            pw.write(str);
        }
        br.close();
        pw.close();
    }

}
