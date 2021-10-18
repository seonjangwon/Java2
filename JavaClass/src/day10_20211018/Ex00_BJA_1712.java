package day10_20211018;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class Ex00_BJA_1712 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 1712번
		// 손익분기점
		// 고정지출 A 생상지출 B 물건가격C
		// 물건 몇대를 팔아야지 손익 분기점을 넘기는가

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = 0; // A
		int num2 = 0; // B
		int num3 = 0; // C
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if ((num3-num2)>0) {
		bw.write(String.valueOf((num1/(num3-num2))+1));
		} else {
			bw.write(String.valueOf(-1));
		}
		bw.flush();
		bw.close();
		
	}

}
