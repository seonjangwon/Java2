package day10_20211018;

public class Member {
	// 아이디 비밀번호 이름 이메일주소
	String id = "";
	String pw = "";
	String name = "";
	String email = "";

	Member() { // 기본

	}

	Member(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	} // 모든 정보 입력 가입

	void memberJoin(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		System.out.println("가입 완료");
	}

	boolean memberLogin (String id2, String pw2) {
		if (this.id.equals(id2) && this.pw.equals(pw2)) {
			
			return true;
		} else {
			return false;
			
		}

	}
	
	void myInfo () {
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
	}
	
	void memberUpdate (String email) {
		this.email = email;
		System.out.println("변경 완료");
	}
	String loginResult = "";
	// 로그인 2 메서드
	boolean memberLogin2 (Member loginMember) {
		boolean result = false;
		if (loginMember.id.equals(this.id) && loginMember.pw.equals(this.pw)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	
	
	
	
	
	//toString 메서드
	// 리턴 타입 : String
	@Override // 메서드 재정의 할 때 사용하는 어노테이션 (Annotation)
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}
