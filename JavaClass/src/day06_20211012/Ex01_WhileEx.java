package day06_20211012;

import java.util.Scanner;

public class Ex01_WhileEx {
	// 상수 선언 : 값이 절대로 바뀌지 않음
	public static final String ANSWERC = "종료";
	
	public static void main(String[] args) {
		/*
		 * 스트링에서는 참조형 클래스타입에서 ==는 될 때도 있고 안 될 때도 있다 .equals()를 활용
		 */
		Scanner scan = new Scanner(System.in);

		String ms = "", end = "종료";
		boolean run = true;
		System.out.println("메시지를 입력하세요 ");
		System.out.println("프로그램을 종료 하려면 '종료'를 입력하세요");
		while (run) {
			System.out.print(">");
			ms = scan.nextLine();
			System.out.println(ms);
			if (ms.equals("종료")) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		// 프로그램을 종료하는 키워드인 종료가 절대로 바뀌지 않을 경우
		final String end2 = "종료";
		do {
			System.out.print(">");
			System.out.print(">");
			ms = scan.nextLine();
			System.out.println(end);
			if (ms.equals(ANSWERC)) {
				run = false;
			}
		} while (run);

		scan.close();
	}

}
