package day11_20211019;

import java.util.ArrayList; // 클래스
import java.util.List; // 인터페이스

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList
		// Collection Framework
		
		// 선언
		// List 객체이름 : list1
		// List에 담을 수 있는 데이터 타입 : String
		// <> 데이터 타입 클래스 이름만 가능
		List<String> list1 = new ArrayList<String>();
		
		// ArrayList에 데이터 저장
		list1.add("첫번째 데이터");
		list1.add("두번째 데이터");
		list1.add(1, "어디에 들어갈까요");
		list1.add(1, "이건 어디에?");
		
		// 데이터 사용(출력)
		// get() : 리턴 있음(String) 매개변수 있음(int)
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		
		// List 크기 확인
		// size() 메서드 호출
		// size() : 리턴있음(int) 매개변수 없음
		System.out.println(list1.size());
		
		
		// 데이터 삭제
		System.out.println("삭제 전 "+list1.get(1));
		list1.remove(1); // 이건 어디에? 를 지워버림
		System.out.println("삭제 후 "+list1.get(1)); // 지워졌으니 알아서 채워짐
		System.out.println("삭제 후 크기 "+list1.size());
		
		// for문을 이용한 list1에 있는 데이서 출력
		
		System.out.println("go");
		for (int i =0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("end");
		
		
		
		
		
		
		
		// List 객체이름 : List2
		// 데이터 타입 : 정수 데이터(Integer) (int : X)
		// long(Long), double(Double), boolean(Boolean)
		// Wrapper 클래스
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(123);
		int num1 = 12345;
		list2.add(num1); // int 타입으로 변수를 만들어서 넣는 것도 가능
		
		Integer num2 = 20; // Integer클래스 타입의 참조형 변수
		list2.add(num2);
		
		
		
		
		
		
		

	}

}
