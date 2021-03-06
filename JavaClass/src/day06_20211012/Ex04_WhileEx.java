package day06_20211012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex04_WhileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * Up&Down 만들기 1~100 까지 랜덤 숫자 큰수 작은수 나누고 맞추면 맞췄습니다 시도 횟수는
		 * 
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int start = 0, num = 0, i = 0; // start : 시작 숫자 num : 내가 쓸 숫자 i는 횟수
		boolean run = true; // while 조작
		start = (int) ((Math.random() * 100) + 1); // 1~100 랜덤

		bw.write(String.valueOf(start) + "\n");
		bw.flush();
		while (run) {
			num = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(num) + "\n");
			bw.flush();
			i++;
			if (num >= 1 && num <= 100) {
				if (num == start) {
					bw.write("맞췄습니다. \n");
					bw.write("시도 횟수는 " + i + "입니다.");
					run = false;
				} else if (num > start) {
					bw.write("더 작은 수를 입력하세요 \n");
					bw.flush();
				} else if (num < start) {
					bw.write("더 큰 수를 입력하세요 \n");
					bw.flush();
				}
			} else {
				bw.write("입력 범위를 벗어났습니다. \n");
				bw.write("다시 입력하세요. \n");
				bw.flush();
			}
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
