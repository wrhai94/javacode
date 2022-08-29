package chapter21;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Wang
 * @Date 2022/7/14
 */
public class Api_ {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);

        InetAddress byName = InetAddress.getByName("DESKTOP-GD34TQC");
        System.out.println(byName);

        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu);
    }
}
