package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("title : "+ rs.getString("bi_title") + " content : "+ rs.getString("bi_content"));
			//	System.out.print(rs.getString("bi_content"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
	public void insertBoard(String title, String content) {
		String sql = "insert into board_info(bi_num, bi_title, bi_content, bi_credat, bi_cretim)";
		sql += "values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),\r\n" + "to_char(sysdate,'HH24MISS'))";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if (cnt == 1) {
				System.out.println("정상적으로 게시물 등록 완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}
public void deleteBoard(int num) {
String sql = "delete from board_info where bi_num=?";
try {
	PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
	ps.setInt(1,num);
	int cnt = ps.executeUpdate();
	if(cnt==1) {
		System.out.println("정상적으로 삭제되었습니다.");
	}
} catch (SQLException e) {
	e.printStackTrace();
}finally {
	DBCon.close();
}
	}
	public void updateBoard(int num, String title, String content) {
		String sql = "update board_info set bi_title=? , bi_content=? where bi_num = ? ";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1,title);
			ps.setString(2, content);
			ps.setInt(3, num);
			int cnt = ps.executeUpdate();
			if(cnt == 1) {
				System.out.println("수정이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}

	}

}