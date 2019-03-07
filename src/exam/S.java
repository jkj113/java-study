package exam;

class F {
	public F() {
		System.out.println("아빠 생성자");
	}

	public F(String str) {
		this();
		System.out.println(str + "아빠 생성자");
	}
}

public class S extends F {
	public S() {
		this("아들이 호출 : ");
		System.out.println("아들1");
	}

	public S(String str) {
		this(str, "아들 2 : ");
		// super(str);
		System.out.println("아들2");
	}
	public S(String str, String str2) {
		super(str2);
		System.out.println("아들3");
	}

	public static void main(String[] args) {
		new S();
	}
}
