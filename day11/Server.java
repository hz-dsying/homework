package day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 将聊天室服务端内容独立完成一次
 * 下面内容可以选做:
 * 配合客户端实现支持昵称与私聊功能
 * @author Bonnie
 *
 */
public class Server {
    ServerSocket ss;
    Map<String, Socket> sockets = new HashMap<String, Socket>();

    public Server(int port){
        try {
            ss = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void service(){
        Socket s;
        while (true){
            try {
                s = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String name = br.readLine();
                sockets.put(name, s);
                System.out.println(name + "进入了聊天室，现在人数为" + sockets.size());
                new MyThread(name, s).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class MyThread extends Thread{
        private String name;
        private Socket s;
        private PrintWriter pw;
        private BufferedReader br;

        public MyThread(String name, Socket s){
            this.s = s;
            this.name = name;
        }

        public void sendMessage(Socket s, String message){
            try {
                pw = new PrintWriter(s.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.println(message);
        }

        public String receiveMessage(){
            try {
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        public void run(){
            while (true){
                String message = receiveMessage();
                Set<String> names = sockets.keySet();
                for(String name : names){
                    Socket s = sockets.get(name);
                    sendMessage(s, this.name + "说：" + message);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bb = new BufferedReader(new InputStreamReader(new FileInputStream("HomeWork/src/day10/server-config.txt")));
//        String str = bb.readLine();
//        int port = Integer.parseInt(str.substring(str.lastIndexOf("=") + 1));
        new Server(8000).service();
    }

}
