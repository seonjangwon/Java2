package day01_20211001;

public class Ex01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변 number1을 선언하면서 값을 10저장
		int number1 = 10; // 초기값
		// 정수형 변수 number2 선언
		int number2 = 0;
		// 특별한 값이 없다면 변수 선언시 초기값을 0으로 준다.
		
		// 선언하지 않은 변수 사용
//		number3 = 20; (x)
		
		//number1 변수 값을 50으로
		number1 = 50;
		// 기존의 number1을 선언한 자리에 50을 덮어쓰기
	
		// number1이 가지고 잇는 값 출력하기
		System.out.println(number1);
		System.out.println("number1");
		// 변수 값은 ""없이
		// ""를 사용하면 문자를 출력
		
//		System.out.println(number3);
		//컴파일오류 = 선언하지 않은 변수를 사용
		
		//long 타입 변수
		long longVar = 10L;
		System.out.println(longVar);
		
		//float 타입 변수
		float floatVar = 1.234f;
		System.out.println(floatVar);
		//double 타입 변수
		boolean boolVar = false;
		System.out.println(boolVar);
		
		//String 타입 변수
		String stringVar = "스트링 타입은 더블쿼터로 묶어준다. 123asdf";
		System.out.println(stringVar);
		// String 클래서 타입의 객체 stringVar		
		
		
		
		
		
		
		
		
	}

}
