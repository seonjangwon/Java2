package day11_20211019;

import java.util.Scanner;

public class Board {
	// 게시판 만들기
	// 필드: 글제목, 작성자, 내용, 조회수
	// 메서드 작성 조회 수정

	Scanner sc = new Scanner(System.in);

	String title = ""; // 글제목
	String writer = ""; // 작성자
	String content = ""; // 내용
	int viewnum = 0; // 조회수

	Board() {// 기본 생성자
		System.out.println("--------------------------------");
		System.out.println("1.글작성 || 2.글 조회 || 3.글 수정 ");
		System.out.println("--------------------------------");
		
	}
	
	// 리턴 : 없음
	// 메서드 이름 : boardWrite
	// 매개변수 : String 3개
	//
	
	void boardWrite(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	// 매개변수와 필드 이름을 다르게 해서 this 안붙이기 가능 
	// 
	void boardWrite2(String title1, String writer1, String content1) {
		title = title1;
		writer = writer1;
		content = content1;
	}
	

	// 리턴 : 없음
	// 메서드 이름 : boardView
	// 매개변수 : 없음
	void boardView() {
		System.out.println("글제목 : " + this.title);
		System.out.println("작성자 : " + this.writer);
		System.out.println("내용 : " + this.content);
		this.viewnum++;
		System.out.println("조회수 : " + this.viewnum);
	}

	// 리턴 : 없음
	// 메서드 이름 : boardUpdate
	// 매개변수 : 없음
	void boardUpdate() {
		System.out.print("제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("내용을 입력하세요 : ");
		String content = sc.nextLine();
		this.title = title;
		this.content = content;
//		System.out.println("글제목 : " + this.title);
//		System.out.println("작성자 : " + this.writer);
//		System.out.println("내용 : " + this.content);
//		System.out.println("조회수 : " + this.viewnum);
		boardView(); // 메서드 안에서 다른 메서드 호출 가능 
	}

}
