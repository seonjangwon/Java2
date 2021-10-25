package day15_20211025;

import java.util.Map;
import java.util.Scanner;

public class MemberService {
	// 귀찮으니 메서드 정보는 생략한다
	// 회원가입 회원조회 로그인 회원정보 변경
	Scanner sc = new Scanner(System.in);
	
	// 회원가입
	Map<Integer,MemberDTO> memberJoin (Map<Integer,MemberDTO> mMap){
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		MemberDTO m = new MemberDTO(id, pw, name, email);
		m.setMemberNumber(mMap.size()+1);
		mMap.put(mMap.size(), m); // 그럼 0부터 들어가겠지
		return mMap;
	}
	
	//전체조회
	void listView (Map<Integer,MemberDTO> mMap) {
		for (Integer i : mMap.keySet()) {
			System.out.println(mMap.get(i));
		}
	}
	
	
	// 로그인
	void memberLogin (Map<Integer,MemberDTO> mMap) {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		int loginNum = -1;
		for (Integer i : mMap.keySet()) {
			if (mMap.get(i).getId().equals(id) && mMap.get(i).getPw().equals(pw)) {
				loginNum = i;
			}
		}
		if (loginNum>=0) {
			System.out.println(mMap.get(loginNum).getName()+"님 환영합니다");
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
		
	}
	
	
	// 회원정보 업데이트
	Map<Integer,MemberDTO> memberUpdate (Map<Integer,MemberDTO> mMap){
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		int loginNum = -1;
		for (Integer i : mMap.keySet()) {
			if (mMap.get(i).getId().equals(id) && mMap.get(i).getPw().equals(pw)) {
				loginNum = i;
			}
		}
		if (loginNum>=0) {
			System.out.print("변경 이메일 : ");
			String email = sc.nextLine();
			mMap.get(loginNum).setEmail(email);			
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
		return mMap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
