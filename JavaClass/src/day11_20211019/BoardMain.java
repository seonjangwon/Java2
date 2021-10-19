package day11_20211019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) throws IOException {
		// 게시판 만들기
//		Scanner sc = new Scanner(System.in); // 새끼 스위치만 쓰면 이상해 시발
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		Board b1 = new Board();
		
		String title = "";
		String writer = "";
		String content = "";
		boolean run = true;

		while (run) {
			System.out.print("번호를 입력하세요 : ");
			num = Integer.parseInt(br.readLine());
			switch (num) {

			case 1: { // 작성
				System.out.print("제목을 입력하세요 : ");
				title = br.readLine();
				System.out.print("작성자을 입력하세요 : ");
				writer = br.readLine();
				System.out.println("내용을 입력하세요");
				System.out.print(">");
				content = br.readLine();
				b1.boardWrite(title, writer, content);
				break;
			}
			case 2: { // 조회

				b1.boardView(); 
				break;
			}
			case 3: { //수정
				b1.boardUpdate();
				break;
			}
			case 4: {//종료
				System.out.println("종료합니다.");
				run=false;
				break;
			}
			default: {
				System.out.println("다시 입력하세요");
			}

			}

		}
		br.close();

	}

}
