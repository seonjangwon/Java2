package day05_20211008;

import java.io.*;

public class Ex06_WhileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * 2개의 주사위를 던겨서 합이 5일 때 종료하는 프로그램
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = 0, num2 = 0, i = 0, result = 0;
		boolean run = true;

		bw.write("횟수 : " + String.valueOf(i) + "\n");
		while (run) {
			num1 = (int) ((Math.random() * 6) + 1);
			num2 = (int) ((Math.random() * 6) + 1);
			result = num1 + num2;
			i++;
			bw.write("횟수 : " + String.valueOf(i) + " 값 : " + String.valueOf(result) + "\n");
			if (result == 5) {
				bw.write("횟수 : " + String.valueOf(i) + " 주사위1 : " + String.valueOf(num1) + " 주사위2 : " + String.valueOf(num2) + " 합 : "
						+ String.valueOf(result) + "에 종료합니다.\n");
				run = false;
			}
		}
		bw.flush();

		bw.close();

	}

}
