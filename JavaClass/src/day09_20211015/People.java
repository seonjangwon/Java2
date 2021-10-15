package day09_20211015;

public class People {
	//필드 선언
	String name;
	int age;
	// 필드 초깃값을 준거
	String nation = "미국";
	
	// 기본생성자 선언
	People () {
		System.out.println("기본생성자 호출");
	}
	
	// 매개 변수가 있는 생성자 선언
	People (String name, int age, String nation) {
		// this. : 현재 클래스의 필드를 가르킬 때
		this.name = name;
		this.age = age;
		this.nation = nation;
		
		// 매개 변수 값 확인
		System.out.println(name);
		System.out.println(age);
		System.out.println(nation);
	}
	People (String name, int age) {
		this.name = name;
		this.age = age;
	}
//	People (String nation, int age) {
//		this.nation = nation;
//		this.age = age;
//	}
	People ( int age, String nation) {
		this.age = age;
		this.nation = nation;
	}
	
	
	
	

}
