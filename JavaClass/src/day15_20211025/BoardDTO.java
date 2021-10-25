package day15_20211025;

public class BoardDTO {
	//글번호 작성자 제복 내용 비밀번호 조회수
	
	private int bnNumber=0;
	private String writer = "";
	private String title = "";
	private String concents ="";
	private String password = "";
	private int hits = 0;
	
	BoardDTO () {// 기본 생성자		
	}

	public BoardDTO(int bnNumber, String writer, String title, String concents, String password, int hits) {
		super();
		this.bnNumber = bnNumber;
		this.writer = writer;
		this.title = title;
		this.concents = concents;
		this.password = password;
		this.hits = hits;
	}
	
	public BoardDTO(String writer, String title, String concents, String password) {
		this.writer = writer;
		this.title = title;
		this.concents = concents;
		this.password = password;
	}
	
	
	public int getBnNumber() {
		return bnNumber;
	}

	public void setBnNumber(int bnNumber) {
		this.bnNumber = bnNumber;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConcents() {
		return concents;
	}

	public void setConcents(String concents) {
		this.concents = concents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	@Override
	public String toString() {
		return "BoardDTO [bnNumber=" + bnNumber + ", writer=" + writer + ", title=" + title + ", concents=" + concents
				+ ", password=" + password + ", hits=" + hits + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
