package day03_20211006;

import java.util.Random;

public class Ex00_zzzz {

	public static void main(String[] args) {
		// ㅇㅇㅇ
		/*
		 * 랜덤으로 학점 계산
		 */
		Random rd = new Random();
		
		int score1 = 0;
		score1 = rd.nextInt(110);
		System.out.println(score1);
		if (score1 >= 0 && score1 < 101) {
			if (score1 >=90) {
				System.out.println("A");
			} else if (score1 >= 80) {
				System.out.println("B");
			} else if (score1 >= 70) {
				System.out.println("C");
			} else if (score1 >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("0보다 작거나 100보다 큼");
		}
			
		
		

	}

}
