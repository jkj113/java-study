package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "delete from board_info where bi_num=?";
			PreparedStatement ps = con.prepareStatement(sql); // 준비가 끝났어 처리 속도가 빠르다 이미 머리 속에 있다????
			ps.setInt(1, 2);
			ps.setInt(1, 5);
			int cnt = ps.executeUpdate(); // 삭제 된 줄의 갯수를 알아야하므로(반영된 것을 알아야되니까)
			System.out.println(cnt);
			// if(cnt==1) {
//				System.out.println("삭제 잘됨!");
//			}else {
//				System.out.println("어라? 이미 없더라!");
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
