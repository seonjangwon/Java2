package day10_20211018;

import java.util.StringTokenizer;

public class Ex00_BJA15596 {

	public static void main(String[] args) {
		// 백준 알고리즘 15596번 메인
		Ex00_BJA15596_c test = new Ex00_BJA15596_c();
		String num = "";
		int[] a = null;
		
		StringTokenizer st = new StringTokenizer(num);
		
		for (int i=0;i<100000;i++) {
			a[i]=Integer.parseInt(num);
		}
		System.out.println(test.sum(a));
		
		
	}

}
