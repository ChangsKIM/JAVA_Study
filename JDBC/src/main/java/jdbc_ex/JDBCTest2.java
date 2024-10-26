package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", // Oracle 데이터베이스 URL
                "C##CHANGS", "760138")) { // 데이터베이스 사용자명과 비밀번호

            // SQL INSERT 문 정의: person 테이블에 이름, 나이, 성별 정보를 삽입
            String sql = "insert into person values('이정옥', 55, 'F')";

            // Statement 객체 생성: SQL 문을 실행하기 위해 필요
            Statement stmt = conn.createStatement();

            // SQL 실행 및 결과 반환: executeUpdate는 영향을 받은 행 수를 반환
            int result = stmt.executeUpdate(sql);

            // 결과 출력: 적용된 행 수를 출력
            System.out.println("몇 건 적용 완료"+result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
