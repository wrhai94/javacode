package chapter27;

/**
 * @Author Wang
 * @Date 2022/7/29
 */
public class Homework02 {
    public static void main(String[] args) {
        /**
         * 字符数 - +
         * 不能以0开头，除了小于1的小数，如 0.1
         */
        String str = "0.9342";
        String reg = "^[-+]?([1-9]\\d*|0)\\.\\d+$";
        if (str.matches(reg)){
            System.out.println("满足");
        } else {
            System.out.println("不满足");
        }
    }
}
