package data;

public class Array2 {
	public static int[] initArray(int size) {
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = (int) (Math.random() * 20) + 1;
		}
		return nums;
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
	public static int[] extendsSize(int size, int[] array) {
	//	int size = array.length+a;  int a,
		int[] tmp = array;   //초기회되기 전에 저장해 둔다.
		array = new int[array.length+size];
		for(int i = 0; i<tmp.length;i++) {
			array[i] = tmp[i];
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String str:args) {
			System.out.println(str);
		}
		int[] nums = initArray(5);
		nums = extendsSize(2,nums);       //size가 7이 되어야한다.
		printArray(nums);

//		int [] nums = new int[3];
//		nums[0] = 5;
//		nums[1] = 10;
//		nums[2]	= 1;
//		
//		int [] tmps = nums; //값을 복사해 둔다.
//		nums = new int[5]; //방을 늘리고
//		nums[0] = tmps[0];
//		nums[1] = tmps[1];
//		nums[2] = tmps[2];
//	
//		for(int num: nums) {
//			System.out.println(num);
//		}
	}
}
