package day10_20211018;

public class Trainee {
	// 이름 나이 휴대폰번호 전공유무
	String name = ""; // 이름
	int age = 0; // 나이
	String phone = ""; // 전화번호 - 도 넣어야해?
	boolean major = false; // 전공
	
	Trainee(){// 기본 생성자
		
	}
	
	
	// 신규 교육생 등록 이건 생성자로 만들으라는건가?
	Trainee (String name, int age, String phone, boolean major){ // 기본 생성자
		this.name = name;
		this.age = age;
		this.phone= phone;
		this.major= major;
		
	}
	
	// 이름 폰번호로 등록 후 전동 유무는 추후 등록
	Trainee (String name, String phone){
		this.name = name;
		this.phone= phone;
//		this.age = 0;  이거 두개는 없어도 되는거네?
//		this.major= false; 어차피 0과 false로 저장이 되어 있으니 초기값으로 그냥 나오는구나
	}
	
	
	
	
	//afterSignup메서드
	void afterSignUp (int age, boolean major ){
		this.age = age;
		this.major = major;
		System.out.println("나이 전공 유무 등록 완료");
	}
	
	
	
	// phoneNumberUpdate메서드
	void phoneNumberUpdate (String phone) {// 이걸 새로 변수를 사용해도 되네
		this.phone = phone;
		System.out.println("폰 번호 변경 완료");
	}
	
	
	
	
	

}
