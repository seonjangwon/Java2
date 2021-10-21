package day12_20211020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_ArrayListEx {

	public static void main(String[] args) {
		// ArrayList에 영어로 된 단어 5개를 스캐너로 입력 받고
		// 입력 받은 단어를 모두 출력하시오
		//크리고 입력 받은 단어중 가장 긴 단어를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int listbig=0;
		
		List<String> list1 = new ArrayList<String>();
		
		String word = "";
		
		for (int i=0;i<5;i++) { // 리스트 만들기
			word = sc.nextLine();
			list1.add(i, word);
		}
		
		for (int i=0;i<5;i++) { // 리스트 출력
			System.out.println(list1.get(i));
		}
		
		for (int i=0;i<5;i++) { // 긴 단어 찾기
			String var = "";
			var=list1.get(i);
			if (var.length()>min) {
				min=var.length();
				listbig= i;
			}
		}
		
		
		
		System.out.println(list1.get(listbig));
		

	}

}
