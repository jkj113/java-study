package exam.ex01;

public class StringEqual {
	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		String s3 = new String("a");
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
	s2 = s1;   //같은 원고지를 쓸 수 있도록
	System.out.println(s1 == s2);
	}
}