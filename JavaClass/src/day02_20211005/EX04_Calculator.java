package day02_20211005;

import java.util.Scanner;

public class EX04_Calculator {

	public static void main(String[] args) {
		// 간단한 덧셈 계산기
		// 스캐너를 이용하여 정수2개를 각각 입력받고 입력 받은 숫자의 합을 출력해세요
		Scanner scan = new Scanner(System.in);
		int var1 = 0;
		int var2 = 0;
		int var3 = 0;
		System.out.print("숫자 1 : ");
		var1 = scan.nextInt();
		
		System.out.print("숫자 2 : ");
		var2 = scan.nextInt();
		
		var3 = var1 + var2;
		System.out.println("합 : " + var3);
		
		
		

	}

}
