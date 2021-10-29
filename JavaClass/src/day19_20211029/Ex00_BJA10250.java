package day19_20211029;

import java.io.IOException;
import java.util.Scanner;

public class Ex00_BJA10250 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 10250 번
		// 호텔
		// T = 테스트 숫자
		// H W N
		// H = 층
		// W = 거리
		// N = 손님 번호
		// 엘레베이터에서 가까운 층으로 선호
		// 3번 손님은 301호 층수는 상관이 없다
		// T가 있으니 for문을 사용해도 되겠군

		Scanner sc = new Scanner(System.in);
		
		int test = 0; // 테스트
		int high = 0; // 높이
		int lenght = 0; // 거리
		int num = 0; // 손님 번호
		

		test = sc.nextInt(); 
		
		for (int i=0; i<test; i++) {
			int highNum =1; // 층 결과
			high = sc.nextInt();
			System.out.println(high);
			lenght = sc.nextInt();
			System.out.println(lenght);
			num = sc.nextInt();
			System.out.println(num);
			while (num>high) {
			num -= high; // 이걸 호수 로 사용할거야
			highNum++; // 1회당 1층씩 올라가
			}
			String n = String.format("%02d", highNum);
			System.out.println(num+n);
		}
		
		
		
		
	}

}
