package day16_20211026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		Map<Integer, BoardDTO> bMap = new HashMap<>();

		BoardService bs = new BoardService();

		int choice = 0; // 선택용
		boolean run = true;
		int bnNumber = 1;

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.글작성 | 2.전체조회 | 3.상세조회 | 4.글삭제 | 5.글수정 | 6.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: { // 글 작성
				bMap = bs.boardWrite(bMap, bnNumber);
				bnNumber++;
				break;
			}
			case 2: { // 전체글조회
				bs.boardListView(bMap);
				break;
			}
			case 3: { // 상세
				bMap = bs.boardView(bMap);
				break;
			}
			case 4: { // 글삭제
				bMap = bs.boardDelete(bMap);
				break;
			}
			case 5: { // 글수정
				bMap = bs.boardUpdate(bMap);
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
