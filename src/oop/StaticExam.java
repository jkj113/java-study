package oop;

public class StaticExam {
	static int num = 1;
	//빠르지만 처리 속도가 느리다.

	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		System.out.println(se.num);
		//		System.out.println(num); //StaticExam안의 num
		//system.out.println(num);  //num의 실행보다 먼저 static을 모두 다 읽어들인다.
	se.num = 10;
	se = new StaticExam(); //위로 다시 가지 않아요 static으로 선언 된 아이는 딱 한번만.
	System.out.println(num);
	System.out.println(StaticExam.num);
	
	}
}
