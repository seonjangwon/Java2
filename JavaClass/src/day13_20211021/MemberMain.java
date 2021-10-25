package day13_20211021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// main 클래스 리스트 관리
		List<MemberDTO> mList = new ArrayList<>();

		MemberService ms = new MemberService();

		int choice = 0;// 선택
		boolean run = true;
		int memberNumber = 1;

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.회원가입 | 2.회원조회 | 3.로그인 | 4.이메일변경 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("번호 > ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {// 회원가입
				mList = ms.memberJoin(mList, memberNumber);
				memberNumber++;
				break;
			}

			case 2: {// 전체 회원조회
				mList = ms.listView(mList);
				break;

			}

			case 3: {// 로그인
				mList = ms.memberLogin(mList);
				break;
			}
			
			case 4: {//이메일 변경
				mList = ms.memberUpdate(mList);
				break;
			}
			
			case 5: {// 종료
				run=false;
				break;
			}
			
			default:
				System.out.println("다시입력하세요");
				break;
			}

		}

	}

}
