package day06_20211012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex03_WhileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * 1- 2+3-4~~~100
		 * 
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 1, test = 0, result = 0, i = 0;
		boolean run = true;

		test = Integer.parseInt(br.readLine());
		while (run) {
			if (num1 % 2 != 0) {
				result += num1;
				i++;
				num1 +=1;
				bw.write(String.valueOf(result)+"\n");
				bw.write(String.valueOf(i)+"\n");
				bw.flush();
			} else {
				result -= num1;
				i++;
				num1 +=1;
				bw.write(String.valueOf(result)+"\n");
				bw.write(String.valueOf(i)+"\n");
				bw.flush();
			}
			if (result == test) {
				run = false;
				bw.write("합계가 " + test + "를 넘었을때 숫자는 " + i + "입니다");
			}
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
