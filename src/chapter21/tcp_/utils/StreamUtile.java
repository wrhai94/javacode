package chapter21.tcp_.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author Wang
 * @Date 2022/7/17
 */
public class StreamUtile {
    public static byte[] getBytesByInputStream (InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }

        byte[] bytes = bos.toByteArray();
        bos.close();
        return bytes;
    }
}
