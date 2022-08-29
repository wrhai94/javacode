package chapter19;

import java.io.*;

/**
 * @Author Wang
 * @Date 2022/7/12
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        File file = new File("e://mytemp/hw02.txt");

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader gbk = new InputStreamReader(fileInputStream, "GBK");
        BufferedReader bufferedReader = new BufferedReader(gbk);
        String line;
        int i = 1;
        while ((line = bufferedReader.readLine()) != null){
//            bufferedWriter.write(i++ + ':' + line + '\r');
            System.out.println(i +  line );
            i++;
        }
        bufferedReader.close();
//        bufferedWriter.close();
    }
}
