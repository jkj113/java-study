package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i = 10; i >= 1; i--) {
			if(i%10==0) {
			numList.add(i);     //방을 지정할 필요가 없다.
		}
		}
		for(int i = 0; i<10 ; i++) {    //i가 index니까.
			System.out.println(numList.get(i));
		}
	}

}
