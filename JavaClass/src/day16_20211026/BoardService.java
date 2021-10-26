package day16_20211026;

import java.util.Map;
import java.util.Scanner;


public class BoardService {
	// 글쓰기 전체글 조회 글삭제 글수정
	
//	Scanner sc = new Scanner(System.in);
	
	// 글쓰기
	// 메서드 이름 : boardWrite
	// 리턴 타입 : Map<Integer, BoardDTO>
	// 매개변수 : Map<Integer, BoardDTO>
	// 작성자 제목 내용 비밀번호 입력
	// 글번호 자동
	
	Map<Integer, BoardDTO> boardWrite (Map<Integer, BoardDTO> bMap, int bnNumber){
		Scanner sc = new Scanner(System.in);
//		int max = 0;
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String contents = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		BoardDTO b = new BoardDTO(writer, title, contents, password);
//		for (Integer n : bMap.keySet()) {
//			if (n>max) {
//				max=n; // 여기에 +1을 해서 글번호랑 키값으로 사용하면
//			}
//		}
		
		
		b.setBnNumber(bnNumber);
		// 사이즈로 하면 글 지우면 글번호 이상해지니 메인에서 관리하자
		bMap.put(bnNumber, b);
		
		return bMap;
	}
	
	// 전체글조회
	// 메서드 이름 : boardListView
	// 리턴 타입 : void
	// 매개변수 : Map<Integer, BoardDTO>
	// 그냥 글 다 나와
	//
	void boardListView (Map<Integer, BoardDTO> bMap) {
		for (Integer b : bMap.keySet()) {
			System.out.println(bMap.get(b));
		}
	}
	
	
	// 상제글 조회
	// 메서드 이름 : boardView
	// 리턴 타입 : Map<Integer, BoardDTO>
	// 매개변수 : Map<Integer, BoardDTO>
	// 원하는 글 조회
	// 글 번호를 받아서 찾아서 조회 + 조회수 1추가
	// 조회수 넣으려면 리턴해야하잔아	
	
	Map<Integer, BoardDTO> boardView (Map<Integer, BoardDTO> bMap) {
		Scanner sc = new Scanner(System.in);
		System.out.print("글 번호 : ");
		int bnNumber = sc.nextInt();
		// 키값으로 하는거니 -1 안해도 되잔아?
		bMap.get(bnNumber).setHits(bMap.get(bnNumber).getHits()+1);
		
		System.out.println(bMap.get(bnNumber));
		
		
		return bMap;
	}
	
	// 글 삭제
	// 메서드 이름 : boardDelete
	// 리턴 타입 : Map<Integer, BoardDTO>
	// 매개변수 : Map<Integer, BoardDTO>
	// 글 번호와 비밀 번호를 입력 받아서 일치하면 글삭제
	// 글을 지우면 글이 올라감 글 번호도 올리자 	
	
	Map<Integer, BoardDTO> boardDelete (Map<Integer, BoardDTO> bMap) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호 : ");
		int bnNumber = sc.nextInt();
		sc.nextLine(); // 스캐너용
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		if (bMap.get(bnNumber).getPassword().equals(password)) {
			bMap.remove(bnNumber);
			// Map은 인덱스 이동이 없어서 편하구만
			// 아닌가 그럼 사이즈로 해두면 지우고 새로만들면 늘어나잔아
			// 글번호 관리를 메인에서 할까
		} else {
			System.out.println("정보가 일치하지 않습니다. ");
		}
		
		
		return bMap;
	}

	// 글 수정
	// 메서드 이름 : boardUpdate
	// 리턴 타입 : Map<Integer, BoardDTO>
	// 매개변수 : Map<Integer, BoardDTO>
	// 글 번호와 비밀 번호를 입력 받아서 맞으면 제목과 내용 수정
	//
	
	Map<Integer, BoardDTO> boardUpdate (Map<Integer, BoardDTO> bMap) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글 번호 : ");
		int bnNumber = sc.nextInt();
		sc.nextLine(); // 스캐너용
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		if (bMap.get(bnNumber).getPassword().equals(password)) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("내용 : ");
			String contents = sc.nextLine();
			bMap.get(bnNumber).setTitle(title);
			bMap.get(bnNumber).setConcents(contents);
			System.out.println(bMap.get(bnNumber));
			
		} else {
			System.out.println("정보가 일치하지 않습니다. ");
		}
		
		
		return bMap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
