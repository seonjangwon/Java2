package day14_20211022;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	// 회원가입 회원조회 로그인 회원정보변경
	Scanner sc = new Scanner(System.in);

	List<MemberDTO> memberJoin(List<MemberDTO> mList, int memberNumber) {

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		MemberDTO m = new MemberDTO(id, pw, name, email);
		m.setMemberNumber(memberNumber);

		mList.add(m);

		return mList;
	}

	List<MemberDTO> listView(List<MemberDTO> mList) {
		for (MemberDTO m : mList) {
			System.out.println(m);
		}
		return mList;
	}

	List<MemberDTO> memberLogin(List<MemberDTO> mList) {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		boolean login = false;
		String loginName = "";
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getId().equals(id) && mList.get(i).getPw().equals(pw)) {

				login = true;
				loginName = mList.get(i).getName();
			}

		}
		if (login) {
			System.out.println(loginName + "님 환영합니다");

		} else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}

		return mList;
	}

	List<MemberDTO> memberUpdate(List<MemberDTO> mList) {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		MemberDTO m = new MemberDTO();
		boolean login = false;
		String loginName = "";
		int emailnum = 0;
		for (int i = 0; i < mList.size(); i++) {
			if (mList.get(i).getId().equals(id) && mList.get(i).getPw().equals(pw)) {

				login = true;
				emailnum = i;
			}

		}
		if (login) {
			System.out.print("변경 이메일 : ");
			String email = sc.nextLine();
			mList.get(emailnum).setEmail(email);

		} else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}

		return mList;
	}

}
