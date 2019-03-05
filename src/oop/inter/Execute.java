package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Execute {
	static void doWork(Developer d) {
		d.goOffice();
		d.working();
		d.eat();
		d.goHome();
	}
	static void doWork(Manager m) {
		m.goOffice();
		m.working();
		m.eat();
		m.goHome();
	}
	static void addList(List<String> list) {
		list.add("abc");
		System.out.println(list);
	}
	public static void main(String[] args) {
		Developer d = new Developer();	
		Manager m = new Manager();
		doWork(d);
		doWork(m);
	
	//	List<String> aList = new ArrayList<>();
	//	List<String> lList = new LinkedList<>();
	//List에 있는 표준을 다 가져다 쓸 수 있다. 표준을 지켜서 만들어서???????
			ArrayList<String> aList = new ArrayList<>();
		LinkedList<String> lList = new LinkedList<>();
		addList(aList);
		addList(lList);
	}

}
