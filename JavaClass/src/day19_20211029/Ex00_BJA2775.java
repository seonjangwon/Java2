package day19_20211029;

import java.util.Scanner;

public class Ex00_BJA2775 {

	public static void main(String[] args) {
		// 백준알고리즘 2775
		// 집이 이상해 a층 b호에 사려면 아래층(a-1)의 b호까지의 인구합의 만큼 살아야해
		// 아파트에 0층도 있어
		// 1층 2호에 사려면 0층 1호+2호 만큼의 인구수 만큼 살아야해
		// 근데 시바 0층에는 i호에는 i명이 산대 뭔병신 같은 집 구조야
		// 그럼 1층 3호에는 6명이 살아야해 이걸 공식을
		// T = 테스트 숫자
		// k = 층
		// n = 호수

		Scanner sc = new Scanner(System.in);

		int test = 0; // T
		int floor = 0; // k
		int num = 0; // n
		test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			int result1 = 0;
			int num1= 0;
			int result2 = 0;
			int result3 =0;
			floor = sc.nextInt(); // 2
			num = sc.nextInt(); // 3 
			for (int h = 0; h < floor; h++) {
				
				for (int j = 0; j <= num; j++) { 
				}
			}
		}

	}

}
