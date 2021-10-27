package day17_20211027_2;

public class BoardMain {

	public static void main(String[] args) {
		// BoardService1을 사용하는경우 
		BoardService1 bs1= new BoardService1();
		bs1.boardWrite();
		
		// BoardService2를 사용하는경우 
		BoardService1 bs2= new BoardService1();
		bs2.boardWrite();
		
		// 인터페이스 활용
		// 인터페이스는 생성자가 없음.
		// 우변에는 인터페이스의 구현 클래스 생성자를 사용함
//		BoardServiceInterface bs = new BoardServiceInterface(); (X)
		
		BoardServiceInterface bs = new BoardServiceInt1();
		bs.boardWrite("aa", "aa");
		
		
	}

}
