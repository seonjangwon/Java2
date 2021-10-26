package day16_20211026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, ClientDTO> cMap = new HashMap<>();
		Map<Integer, BookDTO> bMap = new HashMap<>();
		LibraryService ls = new LibraryService();

		int choice = 0;
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.회원등록 | 2.도서등록 | 3.도서대출 | 4.전체회원 | 5.전체도서 | 6.반납 | 7.종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {// 회원등록
				cMap = ls.clientJoin(cMap);
				break;
			}

			case 2: {// 도서등록
				bMap=ls.bookJoin(bMap);
				break;
			}
			case 3: {// 도서대출
				bMap = ls.bookLoan(bMap, cMap);
				break;
			}
			case 4: { // 전체회원목록
				ls.clientListView(cMap);
				break;
			}
			case 5: { // 전체 도서목록
				ls.bookListView(bMap);
				break;
			}
			case 6: { // 도서 반납
				bMap = ls.bookReturn(bMap);
				break;
			}
			case 7: {// 종료
				run=false;
				System.out.println("종료");
				break;
			}
			}//switch 끝
		} // while 끝
	}

}
