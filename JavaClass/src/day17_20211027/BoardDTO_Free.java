package day17_20211027;

public class BoardDTO_Free extends BoardDTO {
	private String boardPassword ="";
	
	BoardDTO_Free (){}

	public BoardDTO_Free(String boardPassword) {
		super();
		this.boardPassword = boardPassword;
	}
	
	
	// 부모가 가진 필드를 함께 생성자 매개변수로 지정하는 자식클래스 생성자
	public BoardDTO_Free(int boardNumber, String boardWriter, String boardTitle, String boardContents,
			String boardPassword) {
		// super()는 무모의 생성자를 호출하는 명령어
		// super() 사용시 매개변수는 부모클래스가 가지고 있는 생성자 형식과 맞아야함
		super(boardNumber, boardWriter, boardTitle, boardContents);
		this.boardPassword = boardPassword;
	}

	public String getBoardPassword() {
		return boardPassword;
	}

	public void setBoardPassword(String boardPassword) {
		this.boardPassword = boardPassword;
	}
	
	
	
}
