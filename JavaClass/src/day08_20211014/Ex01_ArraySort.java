package day08_20211014;

import java.util.Arrays;

public class Ex01_ArraySort {

	public static void main(String[] args) {
		// 정렬 알고리즘
		// 

		int[] num = { 3, 2, 1, 5, 4 };
		int temp = 0; // swap을 위한 중간 저장용

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[j] < num[i]) { // 비교
					temp = num[i];
					num[i] = num[j];
					num[j]=temp;
					
				}
			}
		}

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

	}

}
