package day01_20211001;

public class Ex05_AssignmentOperatot {

	public static void main(String[] args) {
		// 정수형 변수 2개를 선언해서 대입 연산자 수행결과를 출력해보세요
		
		int num1 = 5, num2 = 3;
		
		System.out.println("+num1: " + num1 + "  num2: " + num2);//5, 3
		num1 += num2;
		System.out.println(num1); // 8
		
		System.out.println("-num1: " + num1 + "  num2: " + num2);//8, 3
		num1 -= num2;
		System.out.println(num1); // 2
		
		System.out.println("*num1: " + num1 + "  num2: " + num2);//5, 3
		num1 *= num2;
		System.out.println(num1); // 15
		
		System.out.println("/num1: " + num1 + "  num2: " + num2);//15, 3
		num1 /= num2;
		System.out.println(num1); // 1
		
		System.out.println("%num1: " + num1 + "  num2: " + num2);//5, 3
		num1 %= num2;
		System.out.println(num1); // 2
//		System.out.println(num1 -= num2);
//		System.out.println(num1 *= num2);
//		System.out.println(num1 /= num2);
//		System.out.println(num1 &= num2);
		// 대입 연산자는 사용을 하면 그 변수에 바로 적용이 돼서 귀찮네
		
		
	}

}
