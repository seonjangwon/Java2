package day10_20211018;

public class TraineeMain {

	public static void main(String[] args) {
		// 교육생 등록
		Trainee t1 = new Trainee("선장원", 27, "010-1234-5678", false);
		
		// 등록 확인
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.phone);
		System.out.println(t1.major);
		
		// 나이 전공유무 변경
		t1.afterSignUp(28,true);
		System.out.println("age major 변경후");
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.phone);
		System.out.println(t1.major);
		
		// 폰번호 변경
		t1.phoneNumberUpdate("010-2345-6789");
		System.out.println("phone 변경후");
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.phone);
		System.out.println(t1.major);
		
		
		
		// 이름 전화 번호 등록 후 나중에 등록
		Trainee t2 = new Trainee("선장원2","010-3456-7890");
		System.out.println(t2.name);
		System.out.println(t2.age);
		System.out.println(t2.phone);
		System.out.println(t2.major);
		
		
		t2.afterSignUp(29, true);
		System.out.println("t2 age major 변경후");
		System.out.println(t2.name);
		System.out.println(t2.age);
		System.out.println(t2.phone);
		System.out.println(t2.major);
		
		t2.phoneNumberUpdate("010-1234-1234");
		System.out.println(" t2 phone 변경후");
		System.out.println(t2.name);
		System.out.println(t2.age);
		System.out.println(t2.phone);
		System.out.println(t2.major);

	}

}
