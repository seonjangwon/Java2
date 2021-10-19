package day11_20211019;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// 사칙 연산 계산기 만들기?
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);

		int start = 0; // 시작 버튼
		int num1 = 0; // 숫자 1
		int num2 = 0; // 숫자 2
		int mul = 0; // 곱셈
		double div = 0; // 나눗셈

		boolean run = true;

		while (run) {
			System.out.print("숫자 입력 : ");
			start = sc.nextInt();
			switch (start) {

			case 1: { // 덧셈
				c1.sum(12, 32);
				break;
			}

			case 2: { // 뺄셈
				System.out.print("숫자 입력1 : ");
				num1 = sc.nextInt();
				System.out.print("숫자 입력2 : ");
				num2 = sc.nextInt();
				c1.subration(num1, num2);
				break;
			}

			case 3: { // 곱셈
				System.out.print("숫자 입력1 : ");
				num1 = sc.nextInt();
				System.out.print("숫자 입력2 : ");
				num2 = sc.nextInt();
				mul = c1.multiplicaton(num1, num2);
				System.out.println(mul);
				break;
			}

			case 4: { // 나눗셈
//				System.out.print("숫자 입력1 : ");
//				num1 = sc.nextInt();
//				System.out.print("숫자 입력2 : ");
//				num2 = sc.nextInt();
				div = c1.division();
				System.out.println(div);
				break;
			}

			case 5: { // 종료
				System.out.println("종료합니다.");
				run = false;
				break;
			}

			default: {
				System.out.println("다시 선택하세요");
				break;
			}
			}

		}

	}

}
