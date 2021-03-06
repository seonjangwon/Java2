package day07_20211013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex00_BjA {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 최댓값 최솟값구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = 0; // 몇 개를 줄건가
		int max = 0; // max는 무슨 숫자가 들어가도 상관없지만
		int min = 10000000; // min은 큰 숫자를 넣거나해야하니 제일 큰 숫자를 넣자

		n = br.read(); // 배열의 숫자

		int[] a = new int[n];
		// 스트링으로 받아서 스트링토큰으로 나눠서 for문으로 n개까지 배열입력을 하자
		int num = 0;

		for (int i = 0; i < a.length; i++) {
			num = br.read();
			a[i] = num;
		}
		// 최솟값 하고 최댓값은 합치면 안됨
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(min + " " + max);
		br.close();

	}

}
