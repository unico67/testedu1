package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String args[]) throws Exception {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
	        String user = "scott";
	        String passwd = "tiger";
			Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);

			PreparedStatement pstmt = conn.prepareStatement(
					     "INSERT INTO student VALUES(?,?)");
			
			Scanner scan = new Scanner(System.in);
			String stname;
			int score;
			String ans;
			int count = 0;

			while(true) {
				System.out.print("학생의 이름을 입력하세요 : ");
				stname = scan.nextLine();
				System.out.print("해당 학생의 점수를 입력하세요(0~100) : ");
				score = scan.nextInt();
				if (score<0 || score>100){
					System.out.println("점수입력 범위를 벗어났습니다. 점수를 올바르게 입력해주세요");
					scan.nextLine();
					continue;
				}
				pstmt.setString(1, stname);
				pstmt.setInt(2, score);
				pstmt.executeUpdate();
				count++;

				scan.nextLine();
				System.out.print("학생 정보를 더 입력하시겠습니까? (y/n) ");
				ans = scan.nextLine();


				if (ans.equals("n") || ans.equals("N")){
					break;
				}
			}

			System.out.printf("\n%d개의 데이터 입력 완료!", count);
			scan.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
