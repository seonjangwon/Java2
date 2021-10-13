package day07_20211013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BjA3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];// 9개의 숫자가 주어짐
		int num = 0; // 필요없는줄 알았는데
		int max = 0; // 이건 최댓값이죠

		for (int i = 0; i < 9; i++) {
			num = Integer.parseInt(br.readLine());
			arr[i] = num;
		} // 이것은 배열을 만들어줘요 아니 미친넘아 왜 이래 
		for (int i = 0; i < 9; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		} // 최댓값을 구했죠?
		for (int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				System.out.println(max);
				System.out.println((i+1));
			} // 이것은 인덱스를 찾아요
		}

	}

}
