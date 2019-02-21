package collection.list;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();    //인스턴스화 => 메모리 생성 컽ㄴ트론  쉬프트 오
//		al.add(10);     //내용이 10인 방 1개 추가
//		al.add(20);      //<>로 데이터 타입을 정해준다. <> =>다이아몬드. 스트링데이터타입의 리스트
		al.add("abc");   
//		al.add(true);
//		al.add('c');     
//		al.add(1.1);    //내용물의 데이터타입은 object(<>안에 아무것도 안 넣으면-확장이 아니라 오픈) => 모두 다 들어갈 수 있다.
		System.out.println(al.size());
		al.remove(0);   //지정한 번호의 방이 없어진다. 배열의 사이즈 줄이는 것.
		System.out.println(al.size());
		
		ArrayList<Integer> numList = new ArrayList<>(); //정해져있는 데이터타입은 넣을 수 없다.(ex,int) 따라서, rapper클래스를 사용한다.
		numList.add(1); //numList의 어떤 공간에 int 1을 넣었다. 
		
	}
}
