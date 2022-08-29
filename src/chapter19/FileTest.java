package chapter19;

import java.io.File;
import java.io.IOException;

/**
 * @Author Wang
 * @Date 2022/7/10
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("F:\\temp/创建文件2.xlsx");
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
