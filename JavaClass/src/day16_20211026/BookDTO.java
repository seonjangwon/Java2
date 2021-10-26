package day16_20211026;

public class BookDTO {
	// 도서번호 도서명 작가 대출여부 대출회원
	private int bookNumber =0;
	private String bookName = "";
	private String bookAuthor ="";
	private boolean bookCheck = false;
	private int clientNumber = 0;
	
	BookDTO (){ // 기본
		
	}

	public BookDTO(int bookNumber, String bookName, String bookAuthor, boolean bookCheck, int clientNumber) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCheck = bookCheck;
		this.clientNumber = clientNumber;
	}
	
	public BookDTO(int bookNumber, int clientNumber) {
		super();
		this.bookNumber = bookNumber;
		this.clientNumber = clientNumber;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public boolean isBookCheck() {
		return bookCheck;
	}

	public void setBookCheck(boolean bookCheck) {
		this.bookCheck = bookCheck;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookCheck=" + bookCheck + ", clientNumber=" + clientNumber + "]";
	}
	
	
	
	
	
	
}
