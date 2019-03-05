package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExam {
	public ArrayList<String> selectArrayList(){
	return new ArrayList<>(); //이것만 내보낼 수 있다.
		}
	public LinkedList<String> selectLinkedList(){
		return new LinkedList<>();
	}

	public List<String> selectList(){
//		return new LinkedList<>();
		return new ArrayList<>();
	}
}
