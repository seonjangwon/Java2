package day13_20211021;

import java.util.Scanner;

public class Ex00_BJA2869 {

	public static void main(String[] args) {
		// 백준 알고리즘 2869번 달팽이
		// 낮동안 A만큼 올라가고
		// 밤동안 B만큼 미끄러지고
		// 막대기는 v
		Scanner sc = new Scanner(System.in);

		int up = 0;
		int down = 0;
		int stick = 0;
		int day = 0;
		boolean run = true;

		up = sc.nextInt();
		System.out.println(up);
		down = sc.nextInt();
		System.out.println(down);
		stick = sc.nextInt();
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
