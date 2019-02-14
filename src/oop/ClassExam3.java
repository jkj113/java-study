package oop;

public class ClassExam3 {
	
	int num = 1;
     //	System.out.println(ce.num); 실행부는 Class안에 바로 넣을 수 없다.
	//자기만의 영역을 가진 곳에 가능하다.
	
	void setNum() {  
	System.out.println(num); //사실은 맨 마지막에 출력되는 것
	}
	
	int getNum() {
		return num;
	}
	public static void main(String[] args) {
		ClassExam3 ce = new ClassExam3();
		System.out.println(ce.num);
		
		ce.num = 5;
		System.out.println(ce.num);
//		System.out.println(ce.getNum()); return 'num' = int 'num' 같은 값이 나온다
		
//		ce = new ClassExam3(); //ce자체를 바꿈 ClassExam3라는 공간에 ce를 새로 넣어서 다시 int num = 1;
		System.out.println(ce.getNum()); 
		
		ce.setNum();
		
		
	}

}
