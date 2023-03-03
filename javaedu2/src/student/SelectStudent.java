package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectStudent {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("1. 모두 출력하기 \n2. 성적이 높은 순으로 출력하기 " +
				"\n3. 70점 이상의 정보들만 출력하기 \n원하는 메뉴의 번호 를 선택 :");
		String answer = scan.nextLine();


		Class.forName("oracle.jdbc.OracleDriver");
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String passwd = "tiger";
		Connection conn = DriverManager.getConnection(jdbcUrl, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs;
		switch (answer) {
			case "1":
				rs = stmt.executeQuery("SELECT name, score  FROM student");
				while (rs.next()){
					System.out.printf("%s %d\n",
							rs.getString("name"), rs.getInt("score"));
				}
				rs.close();
				break;
			case "2":
				rs = stmt.executeQuery("SELECT name, score  FROM student order by score DESC");
				while (rs.next()){
					System.out.printf("%s %d\n",
							rs.getString("name"), rs.getInt("score"));
				}
				rs.close();
				break;
			case "3":
				rs = stmt.executeQuery("SELECT name, score  FROM student where score >= 70");
				if (rs.next()) {
					do {
						System.out.printf("%s %d\n", rs.getString("name"), rs.getInt("score"));
					} while (rs.next());
				} else {
					System.out.println("\n70점 이상의 학생이 존재하지 않습니다.");
				}
				rs.close();
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 다시 실행해 주세요.");				
		}

		scan.close();
		stmt.close();
		conn.close();
	}
}
