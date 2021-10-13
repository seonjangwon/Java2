package day07_20211013;

import java.util.Arrays;
import java.util.Scanner;

public class Ex00_BjA2 {

	public static void main(String[] args) {
		// 백준 알고리즘 최댓값 최솟값구하기
		// 시발 왜 안되는데 시발 진짜 ㅈㄴ 빡치네 시발 진짜 왜 여기서는 되는데 시발시발십ㄹ십ㄹ
		Scanner scan = new Scanner(System.in);
		
		int n = 0; // 몇 개를 줄건가
		int max = 0; // max는 무슨 숫자가 들어가도 상관없지만
		int min = 10000000; // min은 큰 숫자를 넣거나해야하니 제일 큰 숫자를 넣자
		
		n= scan.nextInt(); // 배열의 숫자
		
		int[] a = new int[n];

		int num = 0;
		
		
		for (int i=0; i<a.length;i++) {
			num = scan.nextInt();
			a[i] = num;
		}
		// 최솟값 하고 최댓값은 합치면 안됨
		// 시발 이거 안쓰는데?
//		for (int i = 0; i < n; i++) {
//			if (a[i] < min) {
//				min = a[i];
//			}
//		
//			if (a[i] > max) {
//				max = a[i];
//			}
//		}
		Arrays.sort(a);
		
		System.out.println(a[0]+" "+a[n-1]);

		
	}

}
