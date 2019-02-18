package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());
//		f.printInfo();
		Father f1 = new Father();
		Object o = f1; // 오토캐스팅
		Father f2 = (Father) o;

		Object obj = new Son();
		Father f3 = new Son();
		Son s1 = new Son();
		s1.printInfo();
		f3.printInfo();
		
		Object[] objs = new Object[3];
		objs[0] = obj;
		objs[1] = f3;
		objs[2] = s1;
		((Father)objs[1]).printInfo(); 
		
		Father f4 = (Father)objs[1];
		f4.printInfo();
		}
}
