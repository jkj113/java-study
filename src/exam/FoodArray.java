package exam;

class Food {
	String name;
	int time;
}

public class FoodArray {
	public static void main(String[] args) {
		Food[] f = new Food[3];
		Food[] n = new Food[3];
		for (int i = 0; i < f.length; i++) {
			f[i] = new Food();
			f[i].time = i + 2;
		}
	}
}
