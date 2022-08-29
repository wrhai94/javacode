package chapter25;

import com.mysql.jdbc.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Author Wang
 * @Date 2022/7/24
 */
public class Jdbc_demo2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));

        // 注册驱动,使用反射加载
        Class.forName(properties.getProperty("driver"));
        // 得到连接
        Connection connect = DriverManager
                .getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));

        // 执行数据库操作
        String sql = "select * from t_person";
        // Statement 用于执行静态 SQL 语句并返回结果对象
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }


        // 关闭连接
        resultSet.close();
        statement.close();
        connect.close();
    }
}
