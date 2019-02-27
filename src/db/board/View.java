package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("=======================================================");
			System.out.println("환영합니다.");
			System.out.println("아래에서 아이디를 입력해보아요.");
			System.out.println("=======================================================");
			System.out.println("아이디 : ");
			String id = scan.nextLine();
			if ("osfu".equals(id)) { // id가 null일 수도 있으니까 null이 앞에 오면 에러발생
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
			if ("12345678".equals(pwd)) {
				BoardService bs = new BoardService(); //메모리가 낭비되니까 여기서한다. 로그인 안 될 수도 있잖아??
						System.out.println("환영합니다. osfu님!!! 서비스를 이용해주세요");
			 while(!"q".equals(cmd)){
						System.out.println("1.게시물 등록");
						System.out.println("2.게시물 삭제");
						System.out.println("3.게시물 조회");
						System.out.println("4.게시물 수정");
						System.out.println("q.종료");
						System.out.println("원하시는 번호를 눌러주세요.");
						System.out.print("번호 : ");
						cmd = scan.nextLine();
						if("3".equals(cmd)) {
							bs.selectBoard();  //호출만
							}else if("1".equals(cmd)) {
								System.out.print("제목 : ");
								String title = scan.nextLine();
								System.out.print("내용 : ");
								String content = scan.nextLine();
								bs.insertBoard(title, content);
							}else if("2".equals(cmd)) {
								System.out.println("지우고 싶은 줄 : ");
								String num = scan.nextLine();
								int a = Integer.parseInt(num);
								bs.deleteBoard(a);
							}else if("4".equals(cmd)) {
								System.out.println("수정하고 싶은 줄을 선택하세요 : ");
								String num = scan.nextLine();
								int a = Integer.parseInt(num);
								System.out.println("수정 할 제목 : ");
								String title = scan.nextLine();
								System.out.println("수정 할 내용 : ");
								String content = scan.nextLine();
								bs.updateBoard(a,title,content);
							}
			           }
						
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("없는 아이디입니다!!!");
			}
		} while (!"q".equals(cmd));
		System.out.println("바이. 즐거웠다.");
	}
}
