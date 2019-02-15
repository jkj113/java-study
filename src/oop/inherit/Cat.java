package oop.inherit;

public class Cat extends Animal{
	Cat(int age, String type){
		this.age = age;
		this.type = type;
	}
	public static void main(String[] args){
		Cat cat = new Cat(6,"샴");
		cat.eat();
		cat.sleep();
		cat.run();
		
		Animal dog = new Dog(6,"푸들");
		//Dog dog = new Dog(6,"푸들");
		dog.eat();
		dog.sleep();
		dog.run();
		
//		Dog dog = new Animal();
//		Animal a = new Animal();
		
		}
}