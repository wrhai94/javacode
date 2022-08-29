package chapter25;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author Wang
 * @Date 2022/7/24
 */
public class Jdbc_demo {
    public static void main(String[] args) throws SQLException {
        // 注册驱动
        Driver driver = new Driver();

        // 得到连接
        /*
        jdbc:mysql -- 规定好表示协议，通过jdbc方式连接mysql
        localhost -- 主机，IP地址
        3306 -- mysql 监听的端口
        wrh_bd01 -- 指定数据库
        mysql 连接本质是 socket 连接
         */
        String url = "jdbc:mysql://localhost:3306/wrh_db01";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "kingdee");
        Connection connect = driver.connect(url, properties);

        // 执行数据库操作
        String sql = "select * from t_person";
        // Statement 用于执行静态 SQL 语句并返回结果对象
        Statement statement = connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        // 关闭连接
        statement.close();
        connect.close();
    }
}
