package day03_20211006;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		// 학점 계산 예제
		/*
		 * 점수를 하나 입력 받아서 학점을 출력하는 예제
		 * 90~100 : A
		 * 80~89 : B
		 * 70~79 : C
		 * 60~69 : D
		 * 59이하 : F
		 * 0보다 작거나 100보다 큰 점수 입력에 대해서는 잘못입력하였습니다 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 = 0;
		System.out.print("점수 : ");
		num1 = scan.nextInt();
		
		if (num1 >=90 && num1 < 101 ) { // 90 <= num1 <101 이런 조건식은 자바에서는 사용X
			System.out.println("A");
		} else if (num1 >= 80 && num1 < 101) {
			System.out.println("B");
		} else if (num1 >= 70 && num1 < 101) {
			System.out.println("C");
		} else if (num1 >= 60 && num1 < 101) {
			System.out.println("D");
		} else if (num1 >= 0 && num1 < 101) {
			System.out.println("F");
		} else {
			System.out.println("0보다 작거나 100보다 큼");
		}
		// 중첩으로 해도 될듯 중첩으로 하는게 더 간단하긴하네
		
		if (num1 < 100 && num1 > 0) {
			if (num1 >= 90) {
				System.out.println("A");
			} else if (num1 >= 80) {
				System.out.println("B");
			} else if (num1 >= 70) {
				System.out.println("C");
			} else if (num1 >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("다시 입력해라");
		}
		
		// A ~ F 를 출력하는 출력문을 딱 하만 쓰는 코드로 변경해 보세요.
		// 90~94 : A0, 95~100 : A+
		String var1 = "";
		if (num1 < 100 && num1 > 0) {
			if (num1 >= 90) {
				if (num1 >= 95) {
					var1 = "A+";
				} else {
					var1 = "A0";
				}
//				var1 = "a";
			} else if (num1 >= 80) {
				var1 = "b";
			} else if (num1 >= 70) {
				var1 = "c";
			} else if (num1 >= 60) {
				var1 = "d";
			} else {
				var1 = "f";
			}
		} else {
			var1 = " 다시 입력해라 ";
		}
		System.out.println("학점 : " + var1);
		
		// 
		
		
		
		
		
		
		
		
		

	}

}
