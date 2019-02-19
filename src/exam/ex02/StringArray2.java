package exam.ex02;

public class StringArray2 {
	public String[] strs = new String[10];  
	//strs 사용하기 전까지 초기화. 안하면 Null
	public static void main(String[] args) {
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
	
//		for (int i = 0; i < sa1.strs.length; i++) {
//			int a = i+1;
//			sa1.strs[i] = "" + a;  
//			System.out.println("sa1.strs["+ i +"] = "+ sa1.strs[i] );
//			}	
//		System.out.println();
//		for (int i = 0; i < sa2.strs.length; i++) {
//		int b = 10-i;	
//		sa2.strs[i] = "" + b;
//		System.out.println("sa2.strs["+ i +"] = "+ sa2.strs[i]);
//		}
		for(int i = 0; i <10; i++) {
			sa1.strs[i] = (i+1) + "";
			sa2.strs[i] = (10-i)+ "";
		}
		for(int i = 0; i <10; i++) {
			System.out.println("sa1.strs["+i+"] = "+ sa1.strs[i]);
			System.out.println("sa2.strs["+i+"] = "+ sa2.strs[i]);
		}
			}
}
