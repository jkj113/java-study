package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			numList.add(num);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 숫자를 ,를 기준으로 6개 입력해주세요");
		String Str = scan.nextLine();
		String[] numStrs = Str.split(",");
		System.out.println("입력하신 숫자는 : " + Str);
//		int a = 0;
//		for (String str : numStrs) { for(int i = 0; i < numStr.length;i++)
//			int num = Integer.parseInt(str);
//			if (numList.indexOf(num) != -1) {
//				a++;
//			}
//		}
//		System.out.println("맞춘 갯수는 : " + a);
//		System.out.println(numList);
		ArrayList<Integer> sList = new ArrayList<>();
		for(int i = 0; i <6; i++)
		int num = Integer.parseInt(numStrs[i]);

	}
}
