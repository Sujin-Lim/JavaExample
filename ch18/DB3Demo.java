package ch18;

import java.sql.*;

public class DB3Demo {
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
        StringBuilder sql = new StringBuilder();
        sql.append("insert into person (name, phone, email)");
        sql.append("values (?,?,?)");
        PreparedStatement pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, "배장화");
        pstmt.setString(2, "010-2222-2222");
        pstmt.setString(3, "bae@two.com");
        pstmt.execute();

    }
}
