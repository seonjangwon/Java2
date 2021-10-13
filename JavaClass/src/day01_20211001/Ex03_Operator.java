package day01_20211001;

public class Ex03_Operator {

	public static void main(String[] args) {
		
		/*
		 * 정수형 변수 num1, num2를 각각 선언하고
		 * 초깃값은 num = 5, num2 = 3을 대입한다.
		 * 그리고 +, -, *, /, % 연산자를 사용하여 각각의 연산결과를 출력하시오
		 */
		int num1 = 5;
		int num2 = 3;
		System.out.println("더하기: " + (num1 + num2));
		System.out.println("빼기: " + (num1 - num2));
		System.out.println("곱하기: " +(num1 * num2));
		System.out.println("나누기: " + (num1 / num2));
		System.out.println("나머지: " + (num1 % num2));
		float num3 = 5, num4 = 3;
		float num5 = num3 / num4;
		System.out.println ("나누기: " + (num5));
		
		// 계산 결과를 담는 변수 활용
		int result = 0;
		result = num1 + num2;
		System.out.println("result" + (result));
		result = num1 - num2;
		System.out.println("result" + (result));
		result = num1 * num2;
		System.out.println("result" + (result));
		result = num1 / num2;
		System.out.println("result" + (result));
		result = num1 & num2;
		System.out.println("result" + (result));
		
		// 주의 할 것
		result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;
		result = num1 & num2;
		System.out.println("result" + (result));
		System.out.println("result" + (result));
		System.out.println("result" + (result));
		System.out.println("result" + (result));
		System.out.println("result" + (result));
		// 이런식으로 하면 마지막에 있는 result 결과만 계속해서 나와
		// 아니면 결과 변수를 각각 지정
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 & num2;
		System.out.println("result" + (result1));
		System.out.println("result" + (result2));
		System.out.println("result" + (result3));
		System.out.println("result" + (result4));
		System.out.println("result" + (result5));
		
		// String 변수간의 + 역할
		String strVar1 = "오늘은 ";
		String strVar2 = "금요일입니다.";
		System.out.println(strVar1 + strVar2);
		String strVar3 = strVar1 + strVar2;
		System.out.println(strVar3);
		
		String strVar4 = strVar1 + "10월 1일 입니다.";
		System.out.println(strVar4);
		
		// String 클래스에서 제공하는 length() 메서드 호출
		// length() : String 변수의 길이값(글자수)을 알려줌
		// 공백도 한글자 
		System.out.println(strVar1.length()); //4
		System.out.println(strVar2.length()); //7
		
		
		
		
		
		
	}

}
