package day02_20211005;

public class Ex01_LogicalOperator {

	public static void main(String[] args) {
		// 논리 연산자
		System.out.println("&&");
		boolean result = true && true;
		System.out.println(result);
		result = true && false;
		System.out.println(result);
		result = false && true;
		System.out.println(result);
		result = false && false;
		System.out.println(result);
		
		System.out.println("||");
		boolean result1 = true || true; //or 연산 중에 앞에서 true가 나와서 뒤에꺼는 필요 없으니 dead cord라고 뜨나
		System.out.println(result1);
		result1 = true || false;
		System.out.println(result1);
		result1 = false || true;
		System.out.println(result1);
		result1 = false || false;
		System.out.println(result1);
		
		
		System.out.println("!");
		boolean var1 = false;
		System.out.println(var1); // false
		System.out.println(!var1); // true
		var1 = ! var1;
		System.out.println(var1); // true
		
		System.out.println(7>5); // true
		System.out.println(!(7>5)); // false
		
		
		// 영어, 수학 점수가 둘 다 90점 이상이면 합격(true)
		int engscore = 95;
		int matscore = 97;
		
		boolean result2 = false;
		result2 = engscore >= 90 && matscore >= 90; // true and true = true
		System.out.println("합불" + (result2));
		
		engscore = 80;
		matscore = 97;
		
		result2 = engscore >= 90 && matscore >= 90; // false and true = false
		System.out.println("합불2" + (result2));		
		
		// 회원가입을 할 때 id = myid, password = 1234 라고 가입하고
		// 나중에 로그인을 한다고 했을 때 id, pw를 모두 맞게 입력하면 로그인 성공(true)
		// 둘 중 하나라도 틀린 값을 입력했다면 로그인 실패(false) 처리를 한다고 했을 때
		
		String id = "myid";
		String pw = "1234";
		
		boolean loginresult = (id == "myid") && (pw == "1234"); // true and true = true
		System.out.println("로그인" + (loginresult));
		
		id = "idididid";
		loginresult = (id == "myid") && (pw == "1234"); // false and true = false
		System.out.println("로그인" + (loginresult));
		
		
		
		
		
		
		
		
		

	}

}
