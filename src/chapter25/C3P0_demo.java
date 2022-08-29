package chapter25;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author Wang
 * @Date 2022/7/24
 */
public class C3P0_demo {
    public static void main(String[] args) throws Exception {
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("src\\mysql.properties"));
//        String user = properties.getProperty("user");
//        String password = properties.getProperty("password");
//        String url = properties.getProperty("url");
//        String driver = properties.getProperty("driver");

//        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//        comboPooledDataSource.setDriverClass(driver);
//        comboPooledDataSource.setJdbcUrl(url);
//        comboPooledDataSource.setUser(user);
//        comboPooledDataSource.setPassword(password);
//
//        // 初始化连接数
//        comboPooledDataSource.setInitialPoolSize(10);
//        // 最大连接数
//        comboPooledDataSource.setMaxPoolSize(50);
//        Connection connection = comboPooledDataSource.getConnection();
//        // 数据库操作
//        // 关闭连接
//        connection.close();

        // 方式2 通过配置文件的方式
        // 1. 将c3p0提供的 c3p0-config.xml 复制到 src 目录下
        // 2. 该文件指定了连接数据库和连接池的相参数
        ComboPooledDataSource wrh_db01 = new ComboPooledDataSource("wrh_db01");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            Connection connection = wrh_db01.getConnection();
            connection.close();
        }

        long end = System.currentTimeMillis();
        System.out.println("耗时 = " + (end - start));

    }


}
