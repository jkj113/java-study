package syntax;

public class Condition2 {
	public static String getStr() {
		return "ABC";
	}
	public static void main(String[] args) {
		int a = 4;
//		String str = "a는 3이 아니다."; //처음부터 가정을 하고 만든다.
//		if (a == 3) {
//			str = "a는 3이다.";    //if 조건이 맍으면 출력 
//		}
		String str = (a==3)?"a는 3이다." : "a는 3이 아니다.";
		System.out.println(str);
	
	String s1 ="Dog";
	System.out.println(s1.toLowerCase().equals("dog"));
	System.out.println(s1.equalsIgnoreCase("dog"));
	s1.toLowerCase().equals("dog");
	String str1 = getStr();
	System.out.println(str1);
	str1 = str1.toLowerCase();  //str1을 소문자로
	System.out.println(str1);
	System.out.println(str1.equals("abc"));
	System.out.println(str1.toLowerCase().equals("abc"));
	

	}

}
