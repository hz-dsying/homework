package day11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 将聊天室客户端内容独立完成一次.
 * 下面内容可以选做:
 * 修改代码，使聊天室可以实现用户自定义昵称，
 * 以及私聊功能。
 * 
 * 参考思路:
 * 客户端连接服务端后，要求用户输入一个昵称，
 * 然后将改昵称发送给服务端，服务端那边读取到
 * 客户端发送的第一个字符串认为是昵称。
 * 
 * 私聊功能可以定义格式，例如:
 * @张三:你好
 * 服务端在读取客户端发送过来的昵称时，需要进行
 * 解析，分解出昵称与聊天内容，然后将该聊天内容
 * 单独发送给指定昵称的用户。
 * 服务端的输出流需要使用Map进行维护，而不能再
 * 使用List，Map的key可以是该用户昵称，value
 * 为该用户输出流。
 * 
 * 
 * @author Bonnie
 *
 */
public class Client {
    Socket s;
    String name;
    BufferedReader br;
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
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message){
        pw.println(message);
    }

    public String receiveMessage(){
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        System.out.println("请输入用户名：");
//        BufferedReader bb = new BufferedReader(new InputStreamReader(new FileInputStream("HomeWork/src/day10/config.txt")));
//        String str = bb.readLine();
//        String ip = str.substring(str.lastIndexOf("=") + 1);
//        str = bb.readLine();
//        int port = Integer.parseInt(str.substring(str.lastIndexOf("=") + 1));
        Client client = new Client("localhost", 8000, console.nextLine());
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true){
                    String message = client.receiveMessage();
                    System.out.println(message);
                }
            }
        });
        t.start();
        while(true){
            client.sendMessage(console.nextLine());
        }
    }

}
