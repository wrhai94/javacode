package chapter25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author Wang
 * @Date 2022/7/24
 */
public class Jdbc_transacation {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into tb_student values (null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            preparedStatement.setString(1, String.valueOf(i));
            preparedStatement.setString(2, "学生" + i);
            preparedStatement.addBatch();
            if((i + 1) % 1000 == 0){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时 = " + (end - start));
        JDBCUtils.close(null, preparedStatement, connection);
    }
}
