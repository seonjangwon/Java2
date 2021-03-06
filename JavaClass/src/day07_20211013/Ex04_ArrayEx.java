package day07_20211013;

import java.util.Scanner;

public class Ex04_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 크기가 5인 정수형 배열을 선언하고 스캐너로 값을 받은뒤 입력 받은 값 중에서 가장 큰 값을 출력하시요
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5]; // 배열
		int num = 0;// 받는 숫자
		int max = 0; // 최댓값을 구하기 위해 만듬
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번 정수 입력 : ");
			num = scan.nextInt();
			arr[i] = num;
			if (arr[i] > max) {
				max = arr[i];// 최댓값 구하기 끝
			} 
		} // 배열 만들기 끝

		System.out.println("최댓값은 " + max);
		scan.close();

	}

}
