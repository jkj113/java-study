package oop;

public class ClassExam4 {

	public static void main(String[] args) {
	int num1 = 1;
	int num2 = 2;
	int tmp = num1; //저장할 공간 tmp = 1 (num1이 1이었던것을 기억할 공간)
	num1 = num2;    // 2 = 2
	num2 = tmp;     // 2 = 1  게시판 정렬 할 때
	
	System.out.println("num1 = " +num1);
	System.out.println("num2 = " +num2);
	}
	}
