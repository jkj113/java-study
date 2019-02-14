package syntax;

public class ClassExam {
	int a = 1;       //a = classExam의 int a = 1
	char c = '1';
	String s = "1";
	
	void test() {  //static이 없으므로 얘도 CE를 알아야 실행 가능하다
		System.out.println("난 ClassExam꺼!");
	}
	public static void main(String[] args) {
//		test();  static이 없어서
//		ce.test();
		int a = 1;
		ClassExam ce = new ClassExam();  //저장공간 생성
		System.out.println(ce.a); //ce.a의 데이터 타입은 int
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test();   //CE의 test
		
		int[] arr = new int[3];
		arr[0] = 1;    //여기까진 1
		arr = new int[3];   //새로 생성
		System.out.println(arr[0]);  //= 0
		
//		int a = 1;
//		ClassExam ce = new ClaassExam(); //여기까지 1
		ce.a = 3;
		System.out.println(ce.a);    // = 3
		
	}

}
