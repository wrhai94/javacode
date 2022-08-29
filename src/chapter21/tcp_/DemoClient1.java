package chapter21.tcp_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class DemoClient1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接服务器成功！");
        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("Hello, Server.".getBytes());
//        socket.shutdownOutput();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("你好，服务端！");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        System.out.println("输入结束！");

        InputStream inputStream = socket.getInputStream();
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(buf)) != -1) {
//            System.out.println(new String(buf, 0, readLen));
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader.readLine());
        System.out.println("执行结束");

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
    }
}
