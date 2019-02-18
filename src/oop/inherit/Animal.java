package oop.inherit;

public class Animal implements DoSome{
	int age;
String type;
//아무것도 없는 접근제어자 => default
public void eat() {
System.out.println(age + "살인 "+type+"이 밥을 먹다.");	
}

public void sleep() {
	System.out.println(age+"살인 "+type+"이 잠을 자다.");
}

 public void run() {
	System.out.println(age+"살인 "+type+"이 뛴다.");
}

@Override
public void jump() {
	// TODO Auto-generated method stub
	
}

}
