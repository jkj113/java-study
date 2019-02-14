package oop;

public class ClassExam {
	int[] nums = new int[3];
	String str = "abc";

	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		System.out.println(ce.str);
		ce.str = "바꾸자~";     //str의 값을 변환
		System.out.println(ce.str);
//		ce = null;       //ce를 없앰(아무것도 없는 값으로 변경) -> str은 없는 존재/ 방 자체를 없게
//		System.out.println(ce.str);
		
//		for(int i = 0; i < ce.nums.length; i++) {
//			ce.nums[i] = (i+1)*10;
//			System.out.println((i+1)*10);
 	int length = ce.nums.length;  //가지고 있는 방의 갯수
 	for(int i = 0; i < length; i++) {
 		ce.nums[i] = (i+1)*10;
 			}
 	for(int i = 0; i<length;i++) {
 		System.out.println("nums["+i+"] = " + ce.nums[i]);
 	} //입력단과 출력단을 분리해서 사용하자.
	}
}
