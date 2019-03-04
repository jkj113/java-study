package oop.generic;

import java.util.HashMap;

public class KeyValueGeneric<k,v> extends HashMap<k,v> {

	public static void main(String[] args) {
		KeyValueGeneric<String, String> kvg = new KeyValueGeneric<>();
		kvg.put("name","홍길동");
		String name = kvg.get("name");
	}
}
