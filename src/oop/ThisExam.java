package oop;

public class ThisExam {
	int num = 10;

	void setNum(int num) { //int값의 매개변수가 있어야 작동
		this.num = num;
	}

	int getNum() {
		return this.num; // => 이 Class의 내 Num
	}

	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}
}
