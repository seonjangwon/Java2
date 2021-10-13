package day03_20211006;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		/*
		 * 합격, 불합격 판단
		 * 
		 * 학년, 점수를 각각 입력 받고 합격/ 불학격을 판단한다
		 * 조건 
		 * 1~3학년 : 점수가 60점 이상일 때 합
		 * 4학년 : 점수가 70점 이상일 때 합격
		 * 위 두조건 을 만족 하지 않을 때는 불합격
		 */
		
		Scanner scan = new Scanner(System.in);
		int age = 0, score = 0;
		
		System.out.print("학년 : ");
		age = scan.nextInt();
		
		System.out.print("점수 : ");
		score = scan.nextInt();
		
		String result1 = ""; // 합불
		
		if (age >=1 && age <=3) {
			if (score >= 60 && score <=100) {
				result1 = "합격";
			} else if (score < 60 && score <=100){
				result1 = "불합격";
			} else {
				result1 = "점수 오류";
			}			
		} else if (age == 4) {
			if (score >= 70 && score <=100) {
				result1 = "합격";
			} else if (score < 70  && score <=100) {
				result1 = "불합격";
			} else {
				result1 = "점수 오류";
			}
		} else {
			result1 = "학년 오류";
		}
		
		System.out.println(age + "학년 " + result1 + "입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}
