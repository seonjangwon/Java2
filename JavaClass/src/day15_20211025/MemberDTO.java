package day15_20211025;

public class MemberDTO {
	// 회원 번호 아이디 비밀번호 이메일주소
	private int memberNumber = 0;
	private String id = "";
	private String pw = "";
	private String name = "";
	private String email = "";

	MemberDTO() {// 기본생성

	}

	public MemberDTO(int memberNumber) {
		super();
		this.memberNumber = memberNumber;
	}

	public MemberDTO(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	boolean memberLogin(String loginId, String loginPw) {
		if (this.id.equals(loginId) && this.pw.equals(loginPw)) {
			return true;
		} else {
			return false;
		}
	}

	void memberUpdate(String newemail) {
		email = newemail;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNumber=" + memberNumber + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email="
				+ email + "]";
	}

}
