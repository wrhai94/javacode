package chapter21.tcp_;

import chapter21.tcp_.utils.StreamUtile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class ImagServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("监听 8888 端口");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] bytesByInputStream = StreamUtile.getBytesByInputStream(inputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("src\\文件上传图解.jpg")));
        bufferedOutputStream.write(bytesByInputStream);

        bufferedOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("上传完毕");
    }
}
