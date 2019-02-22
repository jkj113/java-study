package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 0; i<3; i++) {
			int ranNum = (int)(Math.random()*9)+1;
			if(numList.indexOf(ranNum)==-1) {
				numList.add(ranNum);
		}else {
			i--;    //*중복비교*
		}
		}    //중복값 제거 부분
//	System.out.println("numList : "+numList);
	//사용자의 값을 입력 받는 부분
//	int[] nums = new int []{1,2,3}; // 자릿수를 정하면서 값을 초기화 시킬 수 있다.
	Scanner scan = new Scanner(System.in);
	System.out.println("1~9까지 숫자 중에서 ,를 기준으로 숫자 3개를 입력해세요.");
	String Str = scan.nextLine();
	String [] numStrs = Str.split(",");
	int [] nums = new int [3];
	for(int i = 0; i<numStrs.length;i++) {
		nums[i] = Integer.parseInt(numStrs[i]);
	}
//	Scanner scan = new Scanner(System.in);
	//while(sCnt != 3){
// sCnt = 0;
//	bCnt = 0;
//	System.out.println("번호 입력: ");
//	String Str = scan.nextLine();
//	String [] numStrs = Str.split(",");
//	int [] nums = new int [3];
//	for(int i = 0; i<numStrs.length;i++) {
//		nums[i] = Integer.parseInt(numStrs[i]);
//	}
	int bCnt = 0; //결과를 내기 위해서 정해줘야한다.
	int sCnt = 0;
	for(int i = 0;i<nums.length;i++) {
//		if (numList.indexOf(nums[i]) != -1) {
//			if(numList.get(i)==nums[i]) {    //numList의 i를 가져온다(get)
//
//				//				 System.out.println("1S");
//			}else {
////			System.out.println("1B");
//		}
//비교부분		
		if(numList.indexOf(nums[i])!= -1) {
			if(i == numList.indexOf(nums[i])) {
				sCnt++;
			}else {
				bCnt++;
			}
		}
	}
	if(sCnt+bCnt == 0) {
		System.out.println("아웃!");
	}else {
		System.out.println(sCnt+"S, "+bCnt+"B");
	}
	System.out.println("numList : "+numList);
	}
	}
