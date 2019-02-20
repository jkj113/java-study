package exam.ex03;

public class StaticExam01 {
public static String name = "하하";
public String name1 = "호호";

public static void test() {
	System.out.println(StaticExam01.name);
}
public static void main(String[] args) {
	StaticExam01 se = new StaticExam01();
	se.name = "gkgkgkgk";
	se.name1 = "glglglgl";
	se = new StaticExam01();
	
}
}
