package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService {

	public List<BoardInfoVO> selectBoard(){  
		String sql = " select * from board_info";  
		Connection con = DBCon.getCon();
		System.out.println("연결 성공!!");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<BoardInfoVO> biList = new ArrayList<>();
			while(rs.next()) {     
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				System.out.println(bi);
			}
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {   //원래는 return하고 끝이지만 finally니까 실행한다.
		DBCon.close();
		}
		System.out.println(con);
		return null;
	}
}
