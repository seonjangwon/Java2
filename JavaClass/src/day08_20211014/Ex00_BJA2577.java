package day08_20211014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BJA2577 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 2577
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0; // a
		int num2 = 0; // b
		int num3 = 0; // c
		int sum = 0; // 곱
		int temp = 0; // swap용
		int count = 0;
		String sum1 = "";
		int length = 0; // sum의길이
		int[] arr1 = null; // 길이를 배열의 크기로 넣어서 10^i로 나누면 나오지 않을까
		// 곱해서 나온걸 10씩 나눠서 배열로 넣어야하나?
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		num3 = Integer.parseInt(br.readLine());

		sum = num1 * num2 * num3;
		sum1 = String.valueOf(num1 * num2 * num3);
		length = sum1.length();

		arr1 = new int[length];
		for (int i = 0; i < arr1.length; i++) { // 배열 만들기 성공
			temp = sum % 10; // 1의자리 구함
			arr1[i] = temp;
			sum /= 10;
//			System.out.println(arr1[i]);
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == i) {
					count++;
				}
			}
			System.out.println(count);
			count=0;
			
		}

	}

}
