package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList {
public static void main(String[] args) {
	Person p = new Person();
//	p.name = "abc"; //private라서
	p.setName("홍길동");
	System.out.println(p.getName());
	
	List<Person> pList = new ArrayList<>();
	for(int i = 0; i < 10 ; i++) {
	  p = new Person();  //위에와 다른 공간 . 매번 새로운 공간을 만든다
	 pList.add(p); //=>pList.add(new Person());
	 p.setName("이름"+(i+1));
		}
	for(int i = 0; i < 10; i++) {
		p = pList.get(i);
		System.out.println(p.getName());
	}
}
}
