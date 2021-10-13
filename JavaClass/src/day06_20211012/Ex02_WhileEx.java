package day06_20211012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02_WhileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * 정수를 입력하고 마지막에 0을 입력하세요 :
		 * 
		 * 입력한 갯수는 합은 평균은 0을 입력하면
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = 0, i = 0, result = 0;
		boolean run = true;

		bw.write("숫자를 입력하고 마지막에 0을 입력하세요 : \n");
		bw.flush();
		while (run) {
			num1 = Integer.parseInt(br.readLine());
//			bw.write(String.valueOf(num1));
//			bw.flush();

			if (num1 != 0) {
				result += num1;
				i++;
			} else {
				run = false;
				double avg = result / i;
				double avg1 = (double)result / i; // 평균을 구할 때 소수점까지 구하려고 하면 
				bw.write("입력한 갯수는 " + i + "개 \n");
				bw.write("합은 " + result + "입니다. \n");
				bw.write("평균은 " + (result / i) + "입니다. \n");
				bw.write("평균은1 " + avg + "입니다. \n");
				bw.write("평균은2 " + avg1 + "입니다. \n");
			}
		}
		bw.flush();

		bw.close();
		br.close();
	}

}
