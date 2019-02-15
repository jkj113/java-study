package exam;

class Student {
	String name;
	int grade;
	String schoolName;
}

public class StudentArray {
	public static void main(String[] args) {
		Student[] students = new Student[10]; // 공간 22개(0번 방 ~ 21번 방)에 Null만 가득, Student 저장 할 수 있는
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(); //저장공간
			 students[i].grade = i+1;
		}

		
		System.out.println(students[7].grade);
		System.out.println(students[8].grade);
		System.out.println(students[9].grade);
	}

}
