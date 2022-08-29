package chapter21.tcp_;

import chapter21.tcp_.utils.StreamUtile;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class ImageClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream(new File("F:\\note\\file\\java\\MyJava\\img\\文件上传图解.jpg")));
        byte[] bytesByInputStream = StreamUtile.getBytesByInputStream(bufferedInputStream);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytesByInputStream);
        socket.shutdownOutput();

        bufferedInputStream.close();
        outputStream.close();
        socket.close();
    }
}
