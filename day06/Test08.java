package day06;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("HomeWork/src/day06/raf.dat", "rw");
        rf.writeInt(Integer.MAX_VALUE);
        rf.writeLong(Long.MAX_VALUE);
        rf.seek(0);
        int a = rf.readInt();
        System.out.println(a);
        long b = rf.readLong();
        System.out.println(b);
    }

}
