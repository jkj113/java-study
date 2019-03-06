package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		map.put("주소", "전라도 광주");
		map.put("직업", "도적");
		System.out.println(map);
		Set<String> keys = map.keySet(); //데이터타입은 Set<String> keyset()(=>메소드)은 key값들로 이루어진 배열을 만들어 준다.
		System.out.println(keys.size());
		for(String key : keys) {
			System.out.println(key+" : "+map.get(key));
		}
	}
}
