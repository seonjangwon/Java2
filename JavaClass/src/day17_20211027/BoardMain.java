package day17_20211027;

public class BoardMain {

	public static void main(String[] args) {
		// 상속 상속
		BoardDTO b1= new BoardDTO();
		b1.setBoardNumber(1);
		b1.setBoardTitle("제목");
		System.out.println(b1);
		
		BoardDTO b2 = new BoardDTO(2,"작성자2","제목2","내용2");
		System.out.println(b2);
		
		// BoardDTO_Free 객체 생성
		
		BoardDTO_Free bf1 = new BoardDTO_Free();
		// 부모클래스가 가지고 있는 set메서드를 사용할 수 있음
		// 상속을 받았기 때문에
		bf1.setBoardNumber(1);
		bf1.setBoardTitle("제목12");

	}

}
