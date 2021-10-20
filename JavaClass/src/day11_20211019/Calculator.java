package day11_20211019;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	Calculator () { // 기본 생성자
	System.out.println("--------------------------------------------");
	System.out.println("1.덧셈 || 2.뺄셈 || 3.곱셈 || 4.나눗셈 || 5.종료");
	System.out.println("--------------------------------------------");
	}
	
	// 리턴 타입 : 없음
	// 메서드 이름 : sum
	// 매개변수 : int 2개
	void sum (int num1, int num2) { // 1
		int sum = 0;
		sum = num1 + num2;
		System.out.println(sum);
	}
	
	// 리턴 타입 : 없음
	// 메서드 이름 : subration
	// 매개변수 : int 2개
	void subration (int num1, int num2) { // 2
		int sub = 0;
		sub = num1 - num2;
		System.out.println(sub);
	}
	
	// 리턴 타입 : int
	// 메서드 이름 : multiplicaton
	// 매개변수 : int 2개
	int multiplicaton (int num1, int num2) { // 3
		int mul =0;
		mul = num1 * num2;
		
		return mul;
	}
	
	// 리턴 타입 : double
	// 메서드 이름 : division
	// 매개변수 : 없음
	double division () { // 4
		int num1 = 0;
		int num2 = 0;
		System.out.print("숫자 입력1 : ");
		num1 = sc.nextInt();
		System.out.print("숫자 입력2 : ");
		num2 = sc.nextInt();
		double div = 0;
		div = (double)(num1 / num2);
		return div;
	}
	
	
	
	
}
