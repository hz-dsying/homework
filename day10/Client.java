package day10;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 将聊天室客户端今天写的内容独立完成一次，
 * 完成后，修改代码，使聊天室可以实现用户
 * 随意在控制台输入内容并发送给服务端。
 * 
 * 在构造方法中初始化Socket时，服务端的地址与端口通过读取当前包中的config.txt
 * 文件的两行内容得到，并依读取到的值初始化Socket。
 * @author Bonnie
 *
 */
public class Client {
    Socket s;
    String name;
    PrintWriter pw;

    public Client(String ip, int port, String name){
        try {
            s = new Socket(ip, port);
            this.name = name;
        } catch (IOException e) {
            e.printStackTrace();
        }
        init();
        sendMessage(name);
    }

    public void init(){
        try {
            pw = new PrintWriter(s.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message){
        pw.println(message);
    }

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入用户名：");
        BufferedReader bb = new BufferedReader(new InputStreamReader(new FileInputStream("HomeWork/src/day10/config.txt")));
        String str = bb.readLine();
        String ip = str.substring(str.lastIndexOf("=") + 1);
        str = bb.readLine();
        int port = Integer.parseInt(str.substring(str.lastIndexOf("=") + 1));
        Client client = new Client(ip, port, console.nextLine());
        while(true){
            client.sendMessage(console.nextLine());
        }
    }
}
