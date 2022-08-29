package chapter21;

import chapter21.tcp_.utils.StreamUtile;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class Homework02_Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名称");
        String ins = scanner.next();

        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write(ins);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytesByInputStream = StreamUtile.getBytesByInputStream(bufferedInputStream);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("e:\\" + ins)));
        bufferedOutputStream.write(bytesByInputStream);

        bufferedOutputStream.close();
        bufferedInputStream.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("下载完成");
    }

}
