package syntax;

public class GuGuDan {

	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {
			for (int j = 9; j >= 1; j--) {
				System.out.print(i + " X " + j + " = " + (i * j));
				if (j != 1) {
					System.out.print(" , "); // i가 9가 아닐때 ,
				}
			}
			System.out.println(); // 새로운 줄에서
		}

	}
}
