package oop.inherit;

class Book {
	int year;
	String name;

	Book() {
		this.name = "책 제목 : 자바의 정석";
	}

	Book(String name) {
		this(name, 2019);
	}

	Book(String name, int year) {
		this.name = "책 제목 : " + name;
		this.year = year;
		System.out.println(this.name);
		System.out.println("출판 년도: "+this.year);
	}

}

public class ConsExam extends Book {
	ConsExam() {
		super();
		// super("자바의 정석"); //아빠의 생성자
	}

	public static void main(String[] args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		Book b = new Book("자바의 정석2nd",2015);
		
	}

}
