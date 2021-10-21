package day12_20211020;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayListForeach {

	public static void main(String[] args) {
		// foreach (advenced for문)
		
		
		List<String> list = new ArrayList<>();
		
		
		list.add("java");
		list.add("string");
		list.add("integer");
		
		// 전통적인 for문으로 list출력
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//foreach를 사용한 방식
		for (String var: list) {
			System.out.println(var);
		}
		
		

	}

}
