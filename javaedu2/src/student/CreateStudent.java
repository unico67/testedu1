package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CreateStudent {
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "scott";
			String passwd = "tiger";

			Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
			Statement stmt = conn.createStatement();

			Scanner scan = new Scanner(System.in);
			System.out.print("student 테이블 생성을 원하십니까? (y/n) ");
			String aws = scan.nextLine();

			if (aws.equals("y")||aws.equals("Y")) {
				stmt.executeUpdate("CREATE TABLE student "
						+ "(name varchar(15) , score number(3))");
				System.out.println("테이블이 생성 완료!");
			}
			scan.close();
			stmt.close();
			conn.close();
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("오류발생");
		}
	}
}
