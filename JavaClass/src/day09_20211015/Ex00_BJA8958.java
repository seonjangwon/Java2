package day09_20211015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BJA8958 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 8958번
		// OX로 점수 구분하기
		// while 문을 쓰고 해야겠는데?
		// 문제가 여러개라 while문으로 받아야겠다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;// 이건 문제 숫자
		int count = 0;
		int score = 0; // 점수입니다!

		String[] ox1 = null;

		num1 = Integer.parseInt(br.readLine());
		ox1 = new String[num1];
		for (int i = 0; i < num1; i++) {
			score = 0;
			count=0;
			ox1[i] = br.readLine();
			for (int j = 0; j < ox1[i].length(); j++) {
				if (ox1[i].charAt(j) == 'O') {
					score += ++count;
				} else {
					count = 0;
				}
			}
			System.out.println(score);
		}

	}

}
