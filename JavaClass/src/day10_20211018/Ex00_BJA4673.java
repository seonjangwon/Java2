package day10_20211018;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex00_BJA4673 {

	public static void main(String[] args) {
		// 33 = 33+ 3 + 3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int num1 = 33;

//		num1 = Integer.parseInt(br.readLine());
		for (int i = 0; i < 10000; i++) {
			if (num1 <= 10000) {
				num1 = num1 + (num1 / 10) + ((num1 / 10) % 10);
				System.out.println(num1);
			}
		}

	}

}
