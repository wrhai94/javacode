package chapter21.tcp_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class DemoServer1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("监听 9999 端口");
        Socket socket = serverSocket.accept();
        System.out.println("得到客户端连接");
        InputStream inputStream = socket.getInputStream();
//        byte[] buf = new byte[1024];
//        int readLen = 0;
//        while ((readLen = inputStream.read(buf)) != -1){
//            System.out.println(new String(buf, 0, readLen));
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(bufferedReader.readLine());

        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("Hi,client".getBytes());
//        socket.shutdownOutput();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("你好，客户端！");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
