package collection.list;

class Person2{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList2 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		Person2 p2 = p;
		p2 = new Person2();
		p2.setName("hong");
//		p.setName("Black");
		System.out.println(p.getName());
		System.out.println(p2.getName());
	

	}

}
