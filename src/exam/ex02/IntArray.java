package exam.ex02;

public class IntArray {

	public int[] nums = new int[10];

	public boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)	return false;

			if (nums[i] == num)	return true;
		}
		return false;
	}
	public static void main(String[] args) {
		IntArray ia = new IntArray();
		for (int i = 0; i < ia.nums.length; i++) {
			int num = (int) (Math.random() * 10) + 1;
			// ia.nums[i] = (int) (Math.random() * 10) + 1;
			if (ia.compare(num)) {
				i--;
			} else {
				ia.nums[i] = num;
						}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "] = " + ia.nums[i]);
		}

//		for (int i = 0; i < ia.nums.length; i++) {
//			for (int j = i + 1; j < ia.nums.length; j++) {
//				if (ia.nums[i] < ia.nums[j]) { // 자리가 바뀌는 조건(오름차순 ,내림차순)
//					int tmp = ia.nums[i]; // i랑 j값을 바꿔줘야지
//					ia.nums[i] = ia.nums[j];
//					ia.nums[j] = tmp;
//				}
//			}
//		}
//		for (int i = 0; i < ia.nums.length; i++) {
//			System.out.println("ia.nums[" + i + "] = " + ia.nums[i]);
//		}
	}
}

//for(int j = 0; j < ia.nums.length; i++) {
//if(ia.nums[i]<ia.nums[j]) {
//	System.out.println("ia.nums[" + i + "] = " + ia.nums[i]);
//}else {
//System.out.println("ia.nums[" + j + "] = " + ia.nums[j]);	

//double db = Math.random();
//int num = (int)(db*10)+1;