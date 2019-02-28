package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//connection은 여기서만, 값이 바뀔 이유도 없고, 먼저 읽으면 좋으다
public class DBCon {    //final은 대문자로 쓴답
     private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
     private static final String USER = "osfu";
     private static final String PASSWORD = "12345678";
     private static Connection con;
     DBCon(){
    
     }
public static Connection getCon() {
	if(con==null) {
		try {
			con = DriverManager.getConnection(URL,USER,PASSWORD); //통신사 가입 & 전화 연결
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return con;
	}
public static void close() {
	if(con!=null) {
		try {
			con.close();     //통화종료
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	con = null; //통신사 해지
	System.out.println(con);
}

public static void main(String[] args) {
	getCon(); //아무것도 안 뜨면 성공
	close(); 
}
}
//throws SQLException => 일을 미뤘어 뒤로 