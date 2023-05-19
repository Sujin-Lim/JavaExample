package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB2Demo {
    public static Connection makeConnection(){
//        String url = "jdbc:mysql://localhost:3308/contacts?serverTimezone=Asia/Seoul";
        String url = "jdbc:oracle:thin:@//localhost:1521/xe";
        Connection con = null;
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("데이터베이스 연결 중...");
            con = DriverManager.getConnection(url, "system", "1234");
//            con = DriverManager.getConnection(url, "root", "1234");
            System.out.println("연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 찾지 못함");
        } catch (SQLException e) {
            System.out.println("연결 실패");
        }
        return con;
    }

    public static void main(String[] args) throws SQLException{
        Connection con = makeConnection();
        Statement stmt = con.createStatement();

        String sql = "insert into person values " + "('임꺽정', '010-4444-4444','lim@four.com')";

        if (stmt.executeUpdate(sql) == 1) {
            System.out.println("추가 성공");
        } else {
            System.out.println("추가 실패");
        }
        con.close();
        stmt.close();
    }
}
