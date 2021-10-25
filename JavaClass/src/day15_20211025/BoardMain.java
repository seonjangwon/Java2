package day15_20211025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		
		List<BoardDTO> bList = new ArrayList<>();
		
		BoardService bs = new BoardService();
		BoardDTO b = new BoardDTO();
		
		int choice = 0; // 선택용
		boolean run = true;
		
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.글작성 | 2.전체조회 | 3.상세조회 | 4.글삭제 | 5.글수정 | 6.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 : ");
			choice = sc.nextInt();			
			switch (choice) {
			case 1: { // 글 작성
				bList = bs.boardWrite(bList);
				break;
			}
			case 2: { // 전체글조회
				bs.boardListView(bList);
				break;
			}
			case 3: { // 상세
				bList = bs.boardView(bList);
				break;
			}
			case 4: { // 글삭제
				bList = bs.boardDelete(bList);
				break;
			}
			case 5: { // 글수정
				bList = bs.boardUpdate(bList);
				break;
			}
			case 6: { // 종료
				System.out.println("종료 합니다");
				run = false;
				break;
			}
			default: {
				System.out.println("다시 입력하세요");
			}
				
			}// switch 끝
						
		} // while 끝
		
	}

}
