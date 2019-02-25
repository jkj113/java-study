package collection.list;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
	
	private String[] values; // private => 아무것도 못 해.
	public CustomList() {
		values = new String[0]; // (ArrayList처럼) values = null, 선언만 해놨음
	}
	public void add(String value) {
		String[] tmp = this.values;
		this.values = new String[this.values.length + 1]; //
		for (int i = 0; i < tmp.length; i++) {
			this.values[i] = tmp[i];
		}
		this.values[this.values.length - 1] = value; // 길이 -1 => 마지막 index
	}
	public int size() {
		return this.values.length;
	}
	public String toString() {
		String r = "[";
		for (String str : this.values) {
			r += str + ",";
		}
		r = r.substring(0,r.length()-1);  //마지막 , 제거
		r += "]";
		return r;
	}
	public static void main(String[] args) {
		CustomList cl = new CustomList();
		System.out.println(cl.size());
		cl.add("str");
		System.out.println(cl.size());
		System.out.println(cl);
	}
}
