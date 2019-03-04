package db.user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.user.UserInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser(UserInfoVO uivo){
		String sql = "select * from user_info where 1=1"; //1=1 아무의미가 없다(무조건 true). and 조건을 붙이기 위해서
		if(uivo != null) {
			if(uivo.getUiId() != null) {
				sql += " and ui_id=?";
			}
			if(uivo.getUiName() != null) {
				sql += " and ui_name=?";
			}
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
//			int cnt = 1;
			if(uivo != null) {
				if(uivo.getUiId() != null) {
					ps.setString(1, uivo.getUiId());
//					ps.setString(cnt++, uivo.getUiId()); 후순위 연산자!!!!!
				}
				if(uivo.getUiName() != null) {
					if(uivo.getUiId()==null) {
						ps.setString(1, uivo.getUiName());
					}else {
						ps.setString(2, uivo.getUiName());
//						ps.setString(cnt++, uivo.getUiName()); 두번째 if문 필요없다.
						}
				}
			}
			ResultSet rs = ps.executeQuery(); //실행하기 전에 ?가 무엇인지 알려줘야한다. 그래서 위에 if문
			List<UserInfoVO> uiList = new ArrayList<>();
			while(rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num")); //그냥 index 숫자로도 가능 (rs.getInt(1=>index)); 하지만 잘 쓰지 않는다. 언제든 바뀔 수 있음
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				uiList.add(ui);
			}
			return uiList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
