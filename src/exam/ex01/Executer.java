package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());
//		f.printInfo();
		Father f1 = new Father();
		Object o = f1; // 오토캐스팅
		Father f2 = (Father) o;

	}
}
