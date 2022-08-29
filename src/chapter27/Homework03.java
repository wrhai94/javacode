package chapter27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author Wang
 * @Date 2022/7/29
 */
public class Homework03 {
    public static void main(String[] args) {
        String str = "http://www.baidu.com:8080/asd/index.html";
        String reg = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w.]+)$";
        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(str);
        if (matcher.matches()){
            System.out.println("满足格式:" + matcher.group(0));
            System.out.println("协议：" + matcher.group(1));
            System.out.println("域名：" + matcher.group(2));
            System.out.println("端口：" + matcher.group(3));
            System.out.println("文件：" + matcher.group(4));
        } else {
            System.out.println("不满足格式");
        }
    }
}
