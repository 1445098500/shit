import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8","root","password");

            String sql="select * from user where username = ?";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"王五");

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try {
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try {
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
