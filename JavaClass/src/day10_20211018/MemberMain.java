package day10_20211018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		// 로그인 시스템?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Member m1 = new Member();
		String id = "";
		String pw = "";

		m1.memberJoin("captain", "1234", "선장원", "wkddnjs");

		System.out.println(m1.id);
		System.out.println(m1.pw);
		System.out.println(m1.name);
		System.out.println(m1.email);

		System.out.print("아이디 입력 : ");
		id = br.readLine();
		System.out.print("비밀번호 입력 : ");
		pw = br.readLine();

		if (m1.memberLogin(id, pw)) {// 조건식에 boolean값 변수를 넣어서 만들기도 하네
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		m1.myInfo();

		m1.memberUpdate("naver");

		m1.myInfo();
		System.out.println(m1);

		Member loginMember = new Member();
		loginMember.id = "captain";
		loginMember.pw = "1234";
		
		boolean loginResult = false;
		// loginMember 객체를 memberLogin2 메서드에 전
		loginResult = m1.memberLogin2(loginMember);
		if (loginResult) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		

	}

}
