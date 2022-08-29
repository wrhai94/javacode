package chapter21;

import chapter21.tcp_.utils.StreamUtile;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class Homework02_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("监听 8888");
        Socket socket = serverSocket.accept();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        String path = "F:\\note\\file\\java\\MyJava\\img\\";
        File file = new File(path + s);
        if (!file.exists()){
            System.out.println("文件不存在");
            file = new File(path + "单列集合.png");
        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] bytesByInputStream = StreamUtile.getBytesByInputStream(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytesByInputStream);
        socket.shutdownOutput();

        bufferedOutputStream.close();
        bufferedInputStream.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("结束");
    }
}
