package db.board2;

import java.util.Scanner;
//재귀호출 => 나 자신을 다시 부르는 것.
public class Exam {
	public static int getBornYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이를 입력해주세요 .");
		int bornYear = 2019;
		try {
		 bornYear -= Integer.parseInt(scan.nextLine())-1;
		}catch(Exception e) {
			System.out.println("나이는 숫자로 입력해주세요.");
		bornYear = getBornYear(); //호출 (자기 영역이 없으니까)
		}
		return bornYear;
	}

	public static void main(String[] args) {
	int bornYear = getBornYear();   //리턴을 3번 해서 여기로
		System.out.println("당신이 태어난 해는 '"+bornYear+"'입니다.");
	}
}
