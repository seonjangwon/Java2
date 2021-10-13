package day05_20211008;

public class Ex04_Random {

	public static void main(String[] args) {
		/*
		 *  Random 메서드
		 *  특정 범위를 지정하면 해당 범위 내에서 숫자를 무작위로 발생시킴
		 *  1~10 사이의 정수 하나를 발생
		 *  (int) (Math.random() * 10) + 1
		 *  
		 */
		
		System.out.println((int) (Math.random() * 10) + 1); // (int) 실수를 정수로 형변환
		System.out.println(Math.random()); // Math 클래스의 random()메서드 호출
		// 우리는 정수가 필요하기 때문에 실수를 정수로 바꾸는 과정이 필요함.
		// 실수 (double) -> 실수(int) : 형 변환
		// 실수 8byte > 실수 4byte : 강제 형 변환(casting)
		
		System.out.println((int) (Math.random() * 10)); // 0~9 정수
		System.out.println((int) (Math.random() * 10) + 1); // 1~10 정수
		System.out.println((int) (Math.random() * 45) + 1); // 1~45
		
		
		
		int intvar = 10;
		double doublevar = 1.234;
		
		doublevar = intvar; // 정수 > 실수 형변환
		System.out.println(doublevar);
		
		intvar = (int) doublevar; // 실수 > 정수 형변환
		System.out.println(intvar);
		

	}

}
