package day05_20211008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex00_zzzz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = 0, num2 = 0, num3 = 0;// 1은 개수 2는 가장 작은 수
		String result = "";
		String first = ""; // 처음 배열
		String two = ""; // 2번 배열
		first = br.readLine();
		two = br.readLine();
		StringTokenizer st = new StringTokenizer(first);
		num1 = Integer.parseInt(st.nextToken()); // 2번 배열 개수
		num2 = Integer.parseInt(st.nextToken()); // 이 숫자보다 작은 수를 골라야함
		StringTokenizer st2 = new StringTokenizer(two);

		for (int i = 1; i <= num1; i++) {
			num3 = Integer.parseInt(st2.nextToken());
			if (num3 < num2) {
			result = num3+" "; 
			bw.write(String.valueOf(result));
			}
		}
		bw.flush();
		
		bw.close();
		br.close();
	}
}