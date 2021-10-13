package day07_20211013;

import java.util.Scanner;

public class Ex01WhileEx {

	public static void main(String[] args) {
		/*
		 * 1. 예금 2. 출금 3. 잔고 4. 종료 선택
		 * 
		 * 
		 * 
		 * 뭐지 스위치 케이스로 만드는게 아닌가 if로도 만들 수 있긴한데
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0; // 1은 잔고 2는 금액입력
		String var = ""; // 선택
		boolean run = true;
		System.out.println("-------------------------------");
		System.out.println("1. 예금 2. 출금 3. 잔고  4. 종료");
		System.out.println("-------------------------------");

		do {
			System.out.print("선택 > ");
			var = scan.nextLine(); //scan이 오류로 Int랑 Line랑 섞이면서 두번 입력됨
			// BefferedReader 쓰자

			switch (var) {
			case "예금":
				System.out.print("예금액 : ");
				num2 = scan.nextInt();
				num1 += num2;
				System.out.println("현재 잔액은 " + num1 + " 원 입니다.");
				break;
			case "출금":
				System.out.print("출금액 : ");
				num2 = scan.nextInt();
				if (num1 > num2) {
					num1 -= num2;
					System.out.println("현재 잔액은 " + num1 + " 원 입니다.");
				} else {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재 잔액은 " + num1 + " 원 입니다.");
				}
				break;
			case "잔고":
				System.out.println("현재 잔액은 " + num1 + " 원 입니다.");
				break;
			case "종료":
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못입력했습니다");
				break;

			}
			scan.nextLine();
		} while (run);
		scan.close();

	}

}
