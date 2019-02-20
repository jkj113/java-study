package exam.ex03;

public class Cat {
	public String name;
	public int age;
	
	public String toString() {
		return "이 고양이의 이름은 "+name+"이구요, 나이는 "+age+"입니다.";
	}
	public static void main(String[] args) {
//		Cat c1 = new Cat();
//		Cat c2 = new Cat();
//		Cat c3 = new Cat();
//		c1.name = "이름1";
//		c1.age = 0;
//		c2.name = "이름2";
//		c2.age = 1;
//		c3.name = "이름3";
//		c3.age = 2;		
//		
//		System.out.println(c1.name);
//		System.out.println(c1.age);
//		System.out.println(c2.name);
//		System.out.println(c2.age);
//		System.out.println(c3.name);
//		System.out.println(c3.age);

		Cat [] c = new Cat[3];
	
	for(int i = 0; i < c.length; i++) {
		c[i] = new Cat();
		c[i].name = "이름"+(i+1);
		c[i].age = i;
	}
	for(int i = 0; i < c.length; i++) {
		System.out.println(c[i].name);
		System.out.println(c[i].age);
		System.out.println(c[i]);
	}
	}
	}
