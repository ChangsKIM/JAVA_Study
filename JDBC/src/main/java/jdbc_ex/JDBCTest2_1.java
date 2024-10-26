package jdbc_ex;

import java.sql.*;

public class JDBCTest2_1 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "C##CHANGS", "760138")) {

            // SQL SELECT 문 정의: 이름이 '이정옥'인 레코드를 조회
            String sql = "SELECT * FROM person WHERE p_name = '이정옥'";

            // Statement 객체 생성
            Statement stmt = conn.createStatement();

            // SELECT 실행 및 결과 집합 받기
            ResultSet rs = stmt.executeQuery(sql);

            // 결과 출력
            while (rs.next()) { // 결과 행이 있을 경우
                String name = rs.getString("p_name"); // 'name' 컬럼 값 읽기
                int age = rs.getInt("p_age");         // 'age' 컬럼 값 읽기
                String gender = rs.getString("p_gender"); // 'gender' 컬럼 값 읽기

                System.out.println("이름: " + name + ", 나이: " + age + ", 성별: " + gender);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
