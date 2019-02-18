package oop.inter;

import oop.inherit.Animal;

public class Print implements PrintSome {
	@Override
	public void printString(String str) {
		System.out.println(str);
	}
	@Override
	public void printChar(char c) {
		System.out.println(c);
	}
	@Override
	public void printTnt(int num) {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Print p = new Print();
		p.printString("abc");
		
		PrintSome ps = new Print();
	 Animal a = new Animal();
	 a.run(); //접근제어자를 public으로 바꿔서 가능하다.
	}
}