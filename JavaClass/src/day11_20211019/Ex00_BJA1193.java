package day11_20211019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BJA1193 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 1193번

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = 0; // X번째 분수를 찾아라!
		int num1 = 1; // 1씩 늘어나고
		int num2 = 1; // 1이 되면 num1값이 되어야??????
		int count = 0; // 숫자를 세다가 X랑 같아지면 멈추고 num1/num2를 구해야해
		// for문??? while문???1
		
		
		test=Integer.parseInt(br.readLine());
		while (count < test) { // n만큼 늘어나면 n+1이 되어야하잔아?
			System.out.println("1 : "+num1 + "/" + num2);
			if (num2 == 1) {
				num1++;
				num2=num1;
				count++;
				System.out.println("2 : "+num1 + "/" + num2);
			} else {
				num2--;
				System.out.println("3 : "+num1 + "/" + num2);
				count++;
			}
		}
		System.out.println(num2 + "/" + num1);

	}

}
