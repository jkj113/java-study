package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class Test {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selectBoard(); 
		System.out.println(biList);
		//try catch에서 만든 biList를 여기로. 그래서 여기서 끝날 때 까지 생명이 있다. 여기서도 계속 유지(저장된 내용도)
	}
}
