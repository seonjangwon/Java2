package day02_20211005;

import java.util.Scanner;

public class Ex05_If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// if 연습
		boolean con = false;
		System.out.println("if문 실행 전");
		// 단일 if문
		if (con) { // con이라는 변수가 true일 때만 실행
			System.out.println("if문 내부");
		}
		System.out.println("if문 실행 후");

		// if else문
		if (con) {
			System.out.println("조건이 true");
		} else {
			System.out.println("조건이 false");
		}

		// 스캐너로 정수를 입력받아 입력 받은 정수가 양수인지 음수인지 출력해보세요
		// 일단 0도 양수라고 판단
		// 0은 0입니다
		int num1 = 0;
		System.out.print("숫자를 입력하세요1 : ");
		num1 = scan.nextInt();

		if (num1 == 0) {
			System.out.println("0입니다");
		} else if (num1 > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}

		// 정수를 입력 받아서 홀수, 짝수를 판단해보세요
		// 음수일 때?
		// 0 보다 큰 숫자에 대해서만 홀/짝 판단을 하고 0이라의 숫자는 다시 입력하라는 내용을 출력
		int num2 = 0;
		System.out.print("숫자를 입력하세요2 : ");
		num2 = scan.nextInt();

		if (num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// 중첩 if문
		if (num2 > 0) { // 양수/음수 판정
			if (num2 % 2 == 0) { // 홀/짝 판정
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			System.out.println("다시 입력하세요. ");
		}

		// 위에 작성한 중첩 if 문을 && 연산을 이용하여 if else if 로 표현
		if (num2 > 0 && num2 % 2 == 0) {
			// num이 0보다 크고 num이 짝수
			System.out.println("짝수");
		} else if (num2 > 0 && num2 % 2 != 0) {
			// num이 0보다 크고 num이 홀수
			System.out.println("홀수");
		} else {
			// num이 0보다 작너나 같다
			System.out.println("0보다 큰 숫자를 입력하세요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
