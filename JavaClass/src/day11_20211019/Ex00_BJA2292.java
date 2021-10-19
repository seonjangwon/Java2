package day11_20211019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BJA2292 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 2292번
		// 벌집
		// 숫자를 받아서 벌집의 몇칸을 가야하는지 구하기
		// 문제는 1은 1칸 2~7은 2칸 8~19는 3칸
		// n=1+6*i

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0; // 숫자 받음
		int n1 = 1;
		int n2 = 1;
		int count = 0;
		boolean run = true;
		int i = 1;
		num = Integer.parseInt(br.readLine());

		while (run) {
			if (num != 1) {
				n1 += (6 * i); // 7 19
				n2 += (6 * (i - 1)); // 1 7
				count = i;
				i++;
				System.out.println("안 " + (count + 1));
				if (n1 >= num && num > n2) { //
					run = false;
				}
			} else {
				run=false;
			}
		}
		System.out.println("밖 " + (count + 1));

	}

}
