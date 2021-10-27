package day17_20211027;

public class BoardDTO {
	private int boardNumber = 0;
	private String boardWriter ="";
	private String boardTitle = "";
	private String boardContents ="";
	
	BoardDTO (){
		
	}

	public BoardDTO(int boardNumber, String boardWriter, String boardTitle, String boardContents) {
		super();
		this.boardNumber = boardNumber;
		this.boardWriter = boardWriter;
		this.boardTitle = boardTitle;
		this.boardContents = boardContents;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public void setBoardNumber(int boardNumber) {
		this.boardNumber = boardNumber;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContents() {
		return boardContents;
	}

	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardNumber=" + boardNumber + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContents=" + boardContents + "]";
	}
	
	
	
	
	
	
	
}
