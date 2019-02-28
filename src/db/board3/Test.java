package db.board3;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selectBoard();
		System.out.println(biList);
	}
}
