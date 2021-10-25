package day15_20211025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MemberMain {

	public static void main(String[] args) {
		// member을 만들어 보자!
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, MemberDTO> mMap = new HashMap<>();
		
		MemberService ms = new MemberService();
		
		int choice = 0;// 선택
		boolean run = true;
		
		
		
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.회원가입 | 2.회원조회 | 3.로그인 | 4.이메일변경 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("번호 > ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {// 회원가입
				mMap=ms.memberJoin(mMap);
				break;
			}

			case 2: {// 전체 회원조회
				ms.listView(mMap);
				break;

			}

			case 3: {// 로그인
				ms.memberLogin(mMap);
				break;
			}
			
			case 4: {//이메일 변경
				mMap = ms.memberUpdate(mMap);
				break;
			}
			
			case 5: {// 종료
				System.out.println("종료합니다");
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
