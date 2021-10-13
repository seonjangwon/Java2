package day07_20211013;

import java.util.Scanner;

public class Ex06_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 아래와 같이 배열이 있을 때 어떤 숫자가 몇번 인덱스에 있는지
		 *  출력 8을 입력하면 8은 9번 인덱스에 있습니다.
		 */
		Scanner scan = new Scanner(System.in);

		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		boolean run = true;
		int num2 = 0;
		System.out.print("정수를 입력하세요 : ");
		while (run) {
			num2 = scan.nextInt();
			if (num2 > 0 && num2 < 11) {
				for (int i = 0; i < num.length; i++) {
					if (num[i] == num2) {
						System.out.println(num2 + "는 " + i + "번 인덱스에 있습니다.");
						run = false;
					}
				}
			} else {
				System.out.print("다시 입력하세요 : ");

			}
		}
		scan.close();
	}

}
