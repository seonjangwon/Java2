package day13_20211021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex00_BJA2870_2 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 2869번 달팽이
		// 낮동안 A만큼 올라가고
		// 밤동안 B만큼 미끄러지고
		// 막대기는 v
		// 설마 static 써야함?

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int up = 0;
		int down = 0;
		int stick = 0;
		int day = 0;
		boolean run = true;
		String var = "";
		
		
//		var = br.readLine();
//		StringTokenizer st = new StringTokenizer(var);
		
		up = br.read();
		System.out.println(up);
//		down = Integer.parseInt(st.nextToken());
		down = br.read();
		System.out.println(down);
//		stick = Integer.parseInt(st.nextToken());
		stick = br.read();
		System.out.println(stick);

		while (run) {
			stick -= (up );
			System.out.println("낮 "+stick);
			if (stick <= 0) {
				run=false;
			}
			stick += (down);
			System.out.println("밤 "+stick);
			if (stick <= 0) {
				run=false;
			}
			day++;
		}
		System.out.println(day);

	}

}
