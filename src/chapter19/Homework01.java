package chapter19;


import java.io.*;

/**
 * @Author Wang
 * @Date 2022/7/12
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        File file = new File("e://mytemp");
        if (file.exists()){
            System.out.println("mytemp 已存在！");
        } else {
            System.out.println("mytemp 创建！");
            file.mkdir();
        }

        File file1 = new File(file, "hello.txt");
        if(file1.exists()){
            System.out.println("hello.txt 已存在！");
        }else {
            file1.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("helle,world~~");
        fileWriter.close();


    }
}
