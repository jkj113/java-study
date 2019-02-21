package syntax;

public class Loop2 {

	public static void main(String[] args) {
		int i = 10;
//		for(;i >= 0; i--) {
//			System.out.println(i);
//		}
//	for(;i>=0;) {
//		System.out.println(i--);
//		
		for(;i>=1;i--) {
			for(int j = 10;j >=1 ;j--) {
				System.out.println(i + "X" +j + " = "+(i*j));
			}
	}
	}
}
