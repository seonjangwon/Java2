package day03_20211006;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		// 정수를 하나 입력 받아 입력 받은 정수가 3의 배수인지 5의 배수인지 3과 5의 공배수인지
		// 아니면 3의 배수도 5의 배수도 아닌지 출력하느 코드를 작성하세요
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		System.out.print("정수 : ");
		num1 = scan.nextInt();
		
		String result1 = "";
		if (num1 > 0) {
		if (num1 % 3 == 0 && num1 % 5 == 0 ) {
			result1 = "3과 5의 공배수";
		} else if (num1 % 3 == 0) {
			result1 = "3의 공배수";
		} else if (num1 % 5 == 0 ) {
			result1 = "5의 공배수";
		} else {
			result1 = "둘 다 아님";
		}
		} else {
			result1 = "0보다 큰 수를 입력하세요";
		}
		
		System.out.println("값은 : " + result1);
		
		
		
		
		
		
		
		
	}

}
