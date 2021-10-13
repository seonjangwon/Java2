package day02_20211005;

import java.util.Scanner;

// 클래스 이름을 Scanner로 만들면 안됨.
public class Ex03_Scanner {

	public static void main(String[] args) {
		// 스캐너 활용 
		// 스캐너 객체를 선언해야 활용 가능
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		System.out.println(num1);
		// 스캐너를 이용하여 num1에 대이터 입력
		System.out.print("숫자를 입력하세요 : ");
		num1 = scan.nextInt(); //Scanner 클래스가 가지고 있는 nextInt() 메서드를 호출
		System.out.println(num1);
		
		String name = ""; // String 초기값은 "";으로 한다
		System.out.print("이름을 입력하세요 : ");
		name = scan.next(); // 띄어쓰기 또는 엔터까지 내용을 저장
		System.out.println(name);
		
		scan.nextLine(); // 스캐너 새로고침 같은 내용
		System.out.print("이름을 입력하세요2 : ");
		name = scan.nextLine(); // 엔터 전까지 내용을 저장
		System.out.println(name);
		
		
		

	}

}
