package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			String sql = "update board_info \r\n" +
			             "set bi_title=? ,\r\n" +
					     "bi_content=? \r\n" +
			             "where bi_num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "제목!!!");    //물음표 순서대로 설정
			ps.setString(2, "내용!!!");
			ps.setInt(3, 6);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("정상적으로 업데이트 됨");
			}else {
				System.out.println("오류는 아닌데 업데이트는 안됨");
			}   //밑에 catch로는 가지 않았다. ex, number값이 없을 때
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
