package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
	}
public class DogList {
	public static void main(String[] args) {
     List <Dog> dList = new ArrayList<>();
	for(int i = 0 ; i < 10; i++) {
	Dog d = new Dog();
	dList.add(d);
	d.setName("강아지"+(i+1));
	d.setAge(i+1);
	}
	for(int i = 0; i < 10; i++) {
   Dog  d = new Dog();
   d = dList.get(i);
   System.out.println("이름 : " +d.getName());
   System.out.println("나이 : " +d.getAge());
	}
}
}