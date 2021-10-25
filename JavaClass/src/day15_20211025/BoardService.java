package day15_20211025;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	// 글쓰기 전체글 조회 글삭제 글수정

	Scanner sc = new Scanner(System.in);

	// 글쓰기
	// 메서드 이름 : boardWrite
	// 리턴 타입 : List<BoardDTO>
	// 매개변수 : List<BoardDTO>
	// 작성자 제목 내용 비밀번호 입력
	// 글번호 자동

	List<BoardDTO> boardWrite(List<BoardDTO> bList) {
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("내용 : ");
		String contents = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		BoardDTO b = new BoardDTO(writer, title, contents, password);
		b.setBnNumber(bList.size() + 1);

		bList.add(b);
		return bList;
	}

	// 전체글조회
	// 메서드 이름 : boardListView
	// 리턴 타입 : void
	// 매개변수 : List<BoardDTO>
	// 그냥 글 다 나와
	//

	void boardListView(List<BoardDTO> bList) {
		for (BoardDTO b : bList) {
			System.out.println(b);
		}
	}

	// 상제글 조회
	// 메서드 이름 : boardView
	// 리턴 타입 : List<BoardDTO>
	// 매개변수 : List<BoardDTO>
	// 원하는 글 조회
	// 글 번호를 받아서 찾아서 조회 + 조회수 1추가
	// 조회수 넣으려면 리턴해야하잔아

	List<BoardDTO> boardView(List<BoardDTO> bList) {
		System.out.print("글 번호 : ");
		int bnNumber = sc.nextInt();
		System.out.println(bList.get(bnNumber - 1));
		// 글번호랑 인덱스 번호랑 차이가 있으니 -1
		int bnN = bList.get(bnNumber-1).getHits();
		bList.get(bnNumber - 1).setHits(bnN + 1);
		return bList;
	}

	// 글 삭제
	// 메서드 이름 : boardDelete
	// 리턴 타입 : List<BoardDTO>
	// 매개변수 : List<BoardDTO>
	// 글 번호와 비밀 번호를 입력 받아서 일치하면 글삭제
	// 글을 지우면 글이 올라감 글 번호도 올리자 

	List<BoardDTO> boardDelete(List<BoardDTO> bList) {
		System.out.println("글 번호 : ");
		int bnNumber = sc.nextInt();
		sc.nextLine(); // 스캐너용
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();

		if (bList.get(bnNumber - 1).getPassword().equals(password)) {
			bList.remove(bnNumber-1);
			System.out.println("삭제 완료");
			for (int i=0; i<bList.size();i++) { // 글을 지웠으니 하나씩 위로
				bList.get(i).setBnNumber(i+1);
			} // 글번호가 지울 때마다 바껴서 귀찮네
		} else {
			System.out.println("정보가 일치하지 않습니다. ");
		}

		return bList;
	}

	// 글 수정
	// 메서드 이름 : boardUpdate
	// 리턴 타입 : List<BoardDTO>
	// 매개변수 : List<BoardDTO>
	// 글 번호와 비밀 번호를 입력 받아서 맞으면 제목과 내용 수정
	//

	List<BoardDTO> boardUpdate(List<BoardDTO> bList) {
		System.out.println("글 번호 : ");
		int bnNumber = sc.nextInt();
		sc.nextLine(); // 스캐너용
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		if (bList.get(bnNumber-1).getPassword().equals(password)) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("내용 : ");
			String contents = sc.nextLine();
			bList.get(bnNumber-1).setTitle(title);
			bList.get(bnNumber-1).setConcents(contents);

		} else {
			System.out.println("정보가 일치하지 않습니다. ");
		}

		return bList;
	}

	//
	// 메서드 이름 :
	// 리턴 타입 :
	// 매개변수 :
	//
	//

}
