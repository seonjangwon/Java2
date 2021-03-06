package day09_20211015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex00_BJA1546 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 1546번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;// 이건 과목 개수
		int score = 0; // 이건 점수
		double max = 0; // 이건 최고점수 구하기
		double sum = 0; // 평균내기용
		double[] sj = null; // 점수 모아둘 배열
		// 그니까 이새끼 자기 점수의 최고점수를 골라서 그점수

		num1 = Integer.parseInt(br.readLine());
		sj = new double[num1]; // 배열 크기 정하고
//		System.out.println(sj.length);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num1; i++) { // 점수를 배열로 만들어야해
			score = Integer.parseInt(st.nextToken());
			sj[i] = score;
//			System.out.println(sj[i]);
		} // 배열은 만들었다 시발 10을 쳤는데 왜 49가 나와 미친 새끼야
		
		for (int i = 0; i < num1; i++) {// 최고점수 구하기
			if (sj[i] > max) {
				max = sj[i];
//				System.out.println(max);
			}
		} // 최고 점수는 끝남
		
		for (int i = 0; i < num1; i++) {// 점수 조작을 시작하자
			sj[i] = (sj[i] / max) * 100;
//			System.out.println(sj[i]);
		} // 점수조작은 끝났어
		
		for (int i = 0; i < num1; i++) {// 합계와 평균을 구하자
			sum += sj[i];
		}
		System.out.println( sum / num1);

	}

}
