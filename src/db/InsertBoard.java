package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null; // 오류가 나더라도 실행하고
		try {
			con = DriverManager.getConnection(url, id, pwd);
//			con.setAutoCommit(false);  자동 저장 끄는
			String title = "제목!!";
			String content = "내용";
			String sql = "insert into board_info";
			sql += "(bi_num, bi_title, bi_content, \r\n" + "bi_credat, bi_cretim)";
			sql += "values(5,?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MISS'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate(); 
			System.out.println(cnt);
			if(cnt == 1) {
				System.out.println("정상적으로 1개가 입력되었다!");
			}else if(cnt == 0) {
			 System.out.println("몰라 안들어 갔는데?");
			}
//         try { 오류가 나더라도 닫히도록 해줘야한다.
//        	 if(con != null) {
//        		 con.close();
//        	 }
         
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
// con.rollback(); 
// con.close(); 자동 저장을 막아놓고 rollback하고 문을 닫으면, 정상적으로 입력이 됐다고 뜨더라도 querybox에 반영되지 않는다.
// rollback을 commit으로 바꾸면 정상적으로 저장되고 반영된다.	
}
