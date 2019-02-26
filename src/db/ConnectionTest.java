package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);  //접속만 딱
			Statement stmt = con.createStatement();   //Statememt - QueryBox의 흰 화면
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
//				System.out.println(rs.getString("title")); 
				System.out.print(rs.getString("num")+","); 
				System.out.print(rs.getString("title")+","); 
				System.out.print(rs.getString("reg_date")+","); 
				System.out.print(rs.getString("content")); 
				System.out.println();
			}
			System.out.println("연결성공!");
//			for(HashMap<String,String> row : rowList) {
//				System.out.println(row);
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
