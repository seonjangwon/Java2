package day02_20211005;

import java.util.Random;
import java.util.Scanner;

public class Ex00_Game {

	public static void main(String[] args) {
		// 장원이가 만든 홀짝 게임!!
		Random rd = new Random(); // 랜덤 객체
		Scanner scan = new Scanner(System.in); // 스캐너 객체
		
		int var1 = 0; // 내가 입력할 숫자
		System.out.print("숫자 : ");
		var1 = scan.nextInt();
		
		
		if (var1 % 2 == 0) {
			var1 = 0; // 0은 짝수
			System.out.println("짝");
		} else {
			var1 = 1; //1은 홀수
			System.out.println("홀");
		}
		
		
		int num1 = 0;
		num1 = rd.nextInt(100); //0~100까지중에 랜덤으로 뽑아주는 메서드
		System.out.println(num1);
		
		int var2 = 0;
		if (num1 % 2 == 0) {
		System.out.println("짝");
		var2 = 0;
		} else {
			System.out.println("홀");
			var2 = 1;
			
		}
		
		if (var1 == var2) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		
	}

}
