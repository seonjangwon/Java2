package day13_20211021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TraineeMain {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		List<TraineeDTO> tList = new ArrayList<>();
		TraineeDTO t1 = new TraineeDTO();
		
		t1.setName("이름 1");
		t1.setAge(20);
		t1.setPhone("010-1234-1111");
		t1.setMajor(false);
		
		TraineeDTO t2 =new TraineeDTO("이름 2",21,"010-1234-2222",true);
		
		TraineeDTO t3 = new TraineeDTO();
		
//		System.out.print("t3 name");
//		t3.setName(sc.nextLine());
//		System.out.print("t3 phone");
//		t3.setPhone(sc.nextLine());
//		System.out.print("t3 age");
//		t3.setAge(sc.nextInt());
//		t3.setMajor(sc.nextBoolean());
		
		tList.add(t1);
		tList.add(t2);
		tList.add(t3);
		
		for (int i=0;i<tList.size();i++ ) { // 
			System.out.println("for");
			System.out.println(tList.get(i).getName());
			System.out.println(tList.get(i).getAge());
			System.out.println(tList.get(i).getPhone());
			System.out.println(tList.get(i).isMajor());
			System.out.println(tList.get(i).toString());
		}
		
		for (TraineeDTO i : tList) {
			System.out.println("foreach");
			System.out.println(i.getName());
			System.out.println(i.getAge());
			System.out.println(i.getPhone());
			System.out.println(i.isMajor());
			System.out.println(i.toString());
		}
		
		// tList를 TraineeService 클래스로 넘겨서 출력
		// 매개변수로 전당하는 값 : tList
		//
		//listView 메서드를 호출하면서 tList를 던달하는 코드 작성

		TraineeService ts1 = new TraineeService();
		
		// 메서드에 점보를 담아서 보내기
		TraineeDTO t4 = new TraineeDTO();
		ts1.listAdd(tList,t4,"이름 4",24,"010-1234-4444",true);
		
		// DTO에 정보를 담아서 보내기
		TraineeDTO t5 = new TraineeDTO("이름 5",24,"010-1234-5555",true);
		ts1.listAdd2(tList, t5);
		
		// TraineeMain에서 traineeList를 관리
		tList = ts1.addTrainee(tList);
		
		ts1.listView(tList);
		


			
		
		
		
		
		
		
		
		
		
		
		
	}

}
