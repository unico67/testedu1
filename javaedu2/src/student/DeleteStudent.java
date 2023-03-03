package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteStudent {
	public static void main(String args[]) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "scott";
        String passwd = "tiger";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Scanner scan = new Scanner(System.in);
		PreparedStatement pstmt = conn
				.prepareStatement("DELETE from student WHERE name = ?");

		System.out.print("삭제하려는 학생이름을 입력해 주세요. : ");
		String stname = scan.nextLine();
		pstmt.setString(1, stname);
		int del_st = pstmt.executeUpdate();
		if (del_st == 0){
			System.out.printf("%s 학생은 테이블에 존재하지 않습니다. \n삭제하고자 하는 학생의 이름을 정확히 입력하여 주세요.", stname);
		}
		else {
			System.out.println(del_st + "행이 삭제되었어요.");
		}

		scan.close();
		pstmt.close();
		conn.close();
	}
}





