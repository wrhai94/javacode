package chapter21;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class Homework01_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("监听 8888");
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true){
            String s = bufferedReader.readLine();
            System.out.println(s);
            if ( s.equals("name")){
                bufferedWriter.write("我是 navo");
            } else if (s.equals("hobby")){
                bufferedWriter.write("编写 Java 程序");
            } else if(s.equals("退出")){
                bufferedWriter.write("程序退出了");
                break;
            } else {
                bufferedWriter.write("你说啥呢？");
            }
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        serverSocket.close();
        System.out.println("结束");
    }
}
