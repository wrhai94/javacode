package chapter27;

/**
 * @Author Wang
 * @Date 2022/7/29
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = "wr-hai_94@sohu.com.cn";
        String reg = "^([\\w-]+)@[a-z|A-Z|.]+[a-z|A-Z]+$";
        if (str.matches(reg)){
            System.out.println("满足");
        } else {
            System.out.println("不满足");
        }
    }
}
