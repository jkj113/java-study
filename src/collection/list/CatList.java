package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

}

public class CatList {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat);
		List<Cat> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Cat c = new Cat(); // 각각의 new Cat을 만들어야하므로 안에서 메모리 생성을 해줘야한다.
			catList.add(c);
			c.setName("냥이" + (i + 1));
			int a = (int) (Math.random() * 30) + 1;
			c.setAge(a);
		}
		for (int i = 0; i < 10; i++) {
			// for(Cat c : catList)
			System.out.println(catList.get(i));
		}

	}

}
