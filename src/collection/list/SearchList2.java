package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList2 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>(); //컴퓨터가 만든 리스트
		for(int i = 0; i<5;i++) {
			int ranNum = (int)(Math.random()*20)+1;
			numList.add(ranNum);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("맞출 번호를 ,를 기준으로 입력해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();    //내가 만든 리스트에 저장 (참조형 데이터타입(정해져있지 않은 데이터타입))
		for(int i = 0; i<strNums.length;i++) {
		int num = Integer.parseInt(strNums[i]);  //스트링데이터를 인트에 넣을 수 없으니까 스트링을 인티저.parseint(스트링을 인트형으로 읽어서)로 해서 인트 넘에 넣어준다.
		anList.add(num);               //괄호있지만 자기 영역이 없으므로 메소드의 호출
		}
		int num = 0;
		for(int i = 0; i<anList.size(); i++) {
			int anNum = anList.get(i);
			if(numList.indexOf(anNum)!= -1){
			num++;
							}
		}
		System.out.println("맞은 갯수 : "+ num);
		System.out.println("내가 입력한 것 : "+ anList);
		System.out.println("자동 생성 : "+ numList);

		//	System.out.println(anList);
				}
	}


