package oop.abst;

//반드시 추상화 class라고 알려줘야 한다. => abstract class
//설계 + 프로토타입 
interface Test {
	public void play();

	public void run();
}

class Child2 extends AbstractTset {
	public void play() {

	}

	public void run() {

	}
}

public abstract class AbstractTset implements Test {
	AbstractTset() {
		System.out.println("난 됨");
	}

	public static void mian(String[] args) {
//		AbstractTset at = new AbstractTset();  //abstract class는 메모리를 생성할 수 없다.	
		// Abstract는 상속 관계일 때
		AbstractTset at = new Child2();
		at.play();

	}

}
