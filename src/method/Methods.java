package method;

public class Methods {
	int test(int a, String str) {
		return 0;
	}

	void test(String str, int a) {

	}

	static String getStr() {
		return "abc"; // 대입과 호출
	}

	static void setStr(String str) {   //데이터 타입이 X = 변수 선언을 못한다.
		System.out.println(str); // 호출만 가능
	}

	public static void main(String[] args) {
		setStr("abc");       //자기 영역X = 호출
		String str = getStr();    
		System.out.println(str);

	}
}
