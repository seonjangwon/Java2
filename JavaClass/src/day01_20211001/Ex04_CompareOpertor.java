package day01_20211001;

public class Ex04_CompareOpertor {

	public static void main(String[] args) {
		/*
		 * num1 =7, num2 = 3을 각각 줬을 때
		 * <, >, <=, >=, ==, !=을 각각 수행한 결과를 출력하세요
		 */
		int num1 = 7, num2 = 3;
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
//		int result = 0;
//		int result = num1 < num2;
		//int에 boolean 값으로 나와서 못함
		//타입 불일치
		boolean result = false;
		result = num1 < num2;
		System.out.println(result);
		result = num1 > num2;
		System.out.println(result);
		result = num1 <= num2;
		System.out.println(result);
		result = num1 >= num2;
		System.out.println(result);
		result = num1 == num2;
		System.out.println(result);
		result = num1 != num2;
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
