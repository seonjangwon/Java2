package day16_20211026;

import java.util.Map;
import java.util.Scanner;

public class LibraryService {
	// 회원등록 도서등록 도서대출 전체회원목록 전체도서목록
	Scanner sc = new Scanner(System.in);
	// 회원등록
	// 메서드 이름 : clientJoin
	// 리턴 타입 : Map<Integer, ClientDTO>
	// 매개변수 : Map<Integer, ClientDTO>
	//
	//

	Map<Integer, ClientDTO> clientJoin(Map<Integer, ClientDTO> cMap) {
//		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		int clientNumber = cMap.size() + 1;// 1번부터

		ClientDTO c = new ClientDTO(clientNumber, name, phone);

		cMap.put(clientNumber, c);// 고객번호랑 키값이랑 같다

		return cMap;
	}

	// 도서등록
	// 메서드 이름 : bookJoin
	// 리턴 타입 : Map<Integer, BookDTO>
	// 매개변수 : Map<Integer, BookDTO>
	//
	//

	Map<Integer, BookDTO> bookJoin(Map<Integer, BookDTO> bMap) {
//		Scanner sc = new Scanner(System.in);
		int bookNumber = bMap.size() + 1; // 1씩 삭제는 없으니 그냥해
		System.out.print("도서명 : ");
		String name = sc.nextLine();
		System.out.print("작가 : ");
		String author = sc.nextLine();

		BookDTO b = new BookDTO(bookNumber, name, author, false, 0);
		// 0번 대출회원은 없어

		bMap.put(bookNumber, b); // 도서번호랑 키값이랑 같음
		return bMap;
	}

	// 도서대출
	// 메서드 이름 : bookLoan
	// 리턴 타입 : Map<Integer, BookDTO>
	// 매개변수 : Map<Integer, BookDTO>
	// 고객 번호를 받아서 도서 번호를 입력 받는다
	// 도서가 대출중이면 불가능하다
	// 심심하니 고객번호 체크를 만들어보자

	Map<Integer, BookDTO> bookLoan(Map<Integer, BookDTO> bMap, Map<Integer, ClientDTO> cMap) {

		boolean bookcheck = false;

		int clNum = clientCheck(cMap);// 고객체크
		if (clNum > 0) {
			int bookNumber = bookCheck(bMap);//

			if (bookNumber > 0) {
				bookcheck = true;
				BookDTO b = null;
				b = bMap.get(bookNumber);
				b.setBookCheck(bookcheck);
				b.setClientNumber(clNum);
			}
		}
		return bMap;
	}

	// 고객체크
	// 메서드 이름 : clientCheck
	// 리턴 타입 : int
	// 매개변수 : Map<Integer, ClientDTO>

	int clientCheck(Map<Integer, ClientDTO> cMap) {
//		Scanner sc = new Scanner(System.in);
		System.out.print("고객번호 입력 : ");
		int clientNumber = sc.nextInt();
		int clNum = 0;
		boolean check = false;
		for (Integer i : cMap.keySet()) {
			if (cMap.get(i).getClientNumber() == clientNumber) {
				clNum = i;
				check = true;
			}
		}
		if (check) {
			System.out.print(cMap.get(clNum).getClientName() + "님 대출시작");
		} else {
			System.out.println("고객번호를 잘못입력했습니다.");
		}

		return clNum;
	}

	// 도서체크
	// 메서드 이름 : bookCheck
	// 리턴 타입 : int
	// 매개변수 : Map<Integer, BookDTO>

	int bookCheck(Map<Integer, BookDTO> bMap) {
//		Scanner sc = new Scanner(System.in);
		System.out.print("도서번호 입력 : ");
		int bookNumber = sc.nextInt();
		int bkNum = 0;
		boolean bkCheck = false;
		boolean bkCheck2 = false;
		for (Integer i : bMap.keySet()) {
			if (bMap.get(i).getBookNumber() == bookNumber) { // 도서번호가 맞아
				if (!bMap.get(i).isBookCheck()) {// 대출가능
					bkNum = i;
					bkCheck = true;
				}
				bkCheck2 = true;
			}
		}
		if (bkCheck2) {
			if (bkCheck) {
				System.out.println(bMap.get(bookNumber).getBookName() + "님 대출시작");
			} else {
				System.out.println("이미 대출중입니다.");
			}
		} else {
			System.out.println("도서번호를 잘못입력했습니다.");
		}

		return bkNum;
	}

	// 전체 회원목록 출력
	// 메서드 이름 : clientListView
	// 리턴 타입 : void
	// 매개변수 : Map<Integer, clientDTO>

	void clientListView(Map<Integer, ClientDTO> cMap) {
		for (Integer i : cMap.keySet()) {
			System.out.println(cMap.get(i));
		}
	}

	// 전체 도서목록 출력
	// 메서드 이름 : bookListView
	// 리턴 타입 : void
	// 매개변수 : Map<Integer, BookDTO>

	void bookListView(Map<Integer, BookDTO> bMap) {
		for (Integer i : bMap.keySet()) {
			System.out.println(bMap.get(i));
		}
	}

	// 도서 반납
	// 메서드 이름 : bookReturn
	// 리턴 타입 : Map<Integer, BookDTO>
	// 매개변수 : Map<Integer, BookDTO>
	// 책 번호를 받아서 대출여부랑 대출고객을 초기화
	Map<Integer, BookDTO> bookReturn (Map<Integer, BookDTO> bMap){
		System.out.print("도서 번호 : ");
		int bkNum = sc.nextInt();
		
		bMap.get(bkNum).setBookCheck(false);
		bMap.get(bkNum).setClientNumber(0);
		
		return bMap;
	}
	
	
	

}
