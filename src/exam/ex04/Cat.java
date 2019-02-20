package exam.ex04;

public class Cat implements Action{

	@Override
	public void speak() {
		System.out.println("야옹~~~~");
		
	}

	@Override
	public void sleep() {
		System.out.println("동동이가 잠");
		
	}

	@Override
	public void eat() {
		System.out.println("고양이가 먹는다.");
		
	}

}
