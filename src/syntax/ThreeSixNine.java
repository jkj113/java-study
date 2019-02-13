package syntax;

public class ThreeSixNine {

	public static void main(String[] args) {
		for (int i = 1; i < 30; i++) {
			if(i==0 || i%3!=0) {
			System.out.println(i);
		}else {
			System.out.println("짝!");	
			}
		}
	}
}
