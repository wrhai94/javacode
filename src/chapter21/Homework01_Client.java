package chapter21;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class Homework01_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while(loop){
            String ins = scanner.next();
            bufferedWriter.write(ins);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            String s = bufferedReader.readLine();
            System.out.println(s);

            if ("退出".equals(ins)){
                loop = false;
            }
        }


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("结束");
    }
}
