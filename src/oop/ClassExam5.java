package oop;

public class ClassExam5 {
	int a = 2;
	
	ClassExam5() {
		System.out.println("난 기본 생성자!");
	} // 이름 괄호 열고닫고 => 생성자의 정의
	// 대문자 클래스 이름과 완벽하게 동일 데이터 타입X

	ClassExam5(int a) {
		System.out.println("난 기본 생성자 아님!");
	}

	public static void main(String[] args) {
	//	ClassExam5(); Method가 아니다

		ClassExam5 ce = new ClassExam5(3);
		ce.a = 4;
		System.out.println(ce.a);
		
	}

}
