package chapter25;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author Wang
 * @Date 2022/7/24
 */
public class JdbcDruid {
    public static void main(String[] args) throws Exception {
        //1. 引入 Druid jar 包
        //2. 加入配置文件,xxx.properties
        //3. 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        connection.close();
    }
}
