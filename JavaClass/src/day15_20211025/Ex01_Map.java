package day15_20211025;

import java.util.HashMap;
import java.util.Map;

public class Ex01_Map {

	public static void main(String[] args) {
		// 맵 선언
		// key : int / value : String
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		
		
		// 맵에 데이터 저장
		// put 메서드 활용 매개변수는 key, value순으로
		map1.put(1, "date1");
		map1.put(2, "date2");
		map1.put(11, "date3");
		
		// 맵에 담긴 데이터 출력
		System.out.println(map1.get(1));
		System.out.println(map1.get(11));
		
		// 덮어쓰기가 된다
		map1.put(11, "date123");
		System.out.println(map1.get(11));
		
		// 반복문에 활용
		for (Integer n:map1.keySet()) {
			String s = map1.get(n);
			System.out.println(s);
			System.out.println(map1.get(n));
		}
		
		Map<String,Integer> map3 = new HashMap<>();
		
		map3.put("키1", 1234);
		map3.put("키키2", 555555);
		
		System.out.println(map3.get("키1"));
		
		for(String s : map3.keySet()) {
			System.out.println("키값 : "+s);
			System.out.println("밸류값 : "+map3.get(s));
		}
		
		
		// 맵 데이터 삭제
		map3.remove("키키2");
		
		
		// TestDTO를 담는 map 선언
		Map<Integer, TestDTO> testMap = new HashMap<>();
		
		// DTO 객체 3개 만들기
		TestDTO test1 = new TestDTO(1, "aaa", "aaa");
		TestDTO test2 = new TestDTO(2, "bbb", "bbb");
		TestDTO test3 = new TestDTO(3, "ccc", "ccc");
		
		// 담기
		testMap.put(1, test1);
		testMap.put(2, test2);
		testMap.put(3, test3);
		
		// key값이 2인 곳에 저장된 데이터 출력
		System.out.println(testMap.get(2)); // test2 객체
		
		for (Integer t : testMap.keySet()) {
			System.out.println(testMap.get(t));
		}
		
		// 맵 크기 확인
		System.out.println(map3.size());
		
		
		
		
		
		
		
		
		
	}

}
