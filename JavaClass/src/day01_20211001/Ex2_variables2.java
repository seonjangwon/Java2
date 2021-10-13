package day01_20211001;

public class Ex2_variables2 {

	public static void main(String[] args) {
		/*
		 * 여러 줄에 길게 주석을 쓰는 법
		 * 
		 * 아래와 같으 조건의 변수를 각각 선언하고 값을 출력하세요
		 * var1 : 정수 10을 가지고있는 변수
		 * var2 : 정수 200억을 가지고 잇는 변수
		 * var3 : 3.14를 가지고 있는 float 변수
		 * var4 : 3.141592를 가지고 있는 double 변수
		 * var5 : true를 가지고 있는 논리형 변수
		 * var6 : 오늘은 2021년 10월 1일 금요일 입니다. 를 가지고 잇는 String 변수
		 * 
		 */

		int var1 =10;
//		int var21 = 20000000000; 21억이 넘어가면
		long var2 = 20000000000L; // 2*10^9
		float var3 = 3.14f;
		double var4 = 3.141592;
		boolean var5 = true;
		String var6 = "오늘은 2021년 10월 1일 금요일입니다";
		
		System.out.println("var1: " + var1);
//		System.out.println("var21: " + var21);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		
		
		
		
	}

}
