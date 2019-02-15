package exam;
class Dog{
		String name;
		int years;
	}
class Cat{
int ages;
String name;
}
public class Animal {
	public static void main(String[] args) {
		Dog[] d = new Dog[5];
		for(int i = 0; i <d.length;i++) {
			d[i] = new Dog();
			d[i].years = i+1;
			d[i].name = "무명"+i;
		}
		System.out.println(d[0].years);
		System.out.println(d[1].years);
		System.out.println(d[4].name);
		System.out.println(d[3].name);
	System.out.println();
		
	Cat[] c = new Cat[5];
		for(int i = 0; i <c.length; i++) {
			c[i] = new Cat();
			c[i].ages = i+1;
		}
		for(int i = 0; i<c.length; i++) {
			System.out.println(c[i].ages);
		}
	
		
	
		
	}
}

