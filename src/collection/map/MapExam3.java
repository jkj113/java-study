package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "가만두지 않겠다.");
		map.put(2, "마지막이다.");
		map.put(3, "음.......");
		System.out.println(map);

		HashMap<String, Object> cat = new HashMap<>();
		cat.put("Name", "냥이1");
		cat.put("Age", 11);
		System.out.println(cat);

		List<HashMap<String, Object>> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, Object> c = new HashMap<>();
			catList.add(c);
			c.put("Name", "냥이" + (i + 1));
			int a = (int) (Math.random() * 30) + 1;
			c.put("Age", a);
		}
		for (int i = 0; i < 10; i++) {
//			System.out.println(catList.get(i));
			HashMap<String, Object> c = catList.get(i);
			c = new HashMap<>(); // c의 링크가 끊기고 새로운 것을 바라본다. c만
			// System.out.println(c);
			c.put("Name", "냥이!!!");
			System.out.println(catList.get(i));
		}

	}
}