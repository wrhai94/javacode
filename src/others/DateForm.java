package others;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Wang
 * @Date 2022/7/21
 */
public class DateForm {
    public static void main(String[] args) {
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(SDF.format(new Date()));
    }
}
