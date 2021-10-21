package day13_20211021;

import java.util.List;
import java.util.Scanner;

public class TraineeService {
	// 메서드 이름 listView
	// 리턴 없음
	// 매개변수 : tList
	
	Scanner sc = new Scanner(System.in);
	
	void listView (List<TraineeDTO> tList) {
		System.out.println("listView 호출됨");
		for (int i=0; i<tList.size();i++) {
			System.out.println(tList.get(i));
		}
		System.out.println("listView 호출 끝");
	}
	
	// 훈련생을 추가하는 메서드
	// 리스트에 훈련생을 추가하는 기능을 수행함.
	// main으로부터 리스트를 넘겨받아 훈령생을 추가하고
	// 다시 Main으로 넘겨주는 코드가 작성 되어야함
	
	//매개변수 : traineeList
	//리턴타입 : List<TraineeDTO>(TraineeDTO객체를 담는 List)
	List<TraineeDTO> addTrainee(List<TraineeDTO> tList){
		System.out.println("addTrainee 호출됨");
		
		TraineeDTO t6 = new TraineeDTO();
		System.out.print("t6 name : ");
		t6.setName(sc.nextLine());
		System.out.print("t6 phone : ");
		t6.setPhone(sc.nextLine());
		System.out.print("t6 age : ");
		t6.setAge(sc.nextInt());
		System.out.print("t6 major : ");
		t6.setMajor(sc.nextBoolean());
		
		tList.add(t6);
		return tList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	void listAdd (List<TraineeDTO> tList,TraineeDTO t, String name, int age,String phone, boolean major) {
		System.out.println("listAdd 호출됨");
		t.setName(name);
		t.setAge(age);
		t.setPhone(phone);
		t.setMajor(major);
		tList.add(t);
		
		System.out.println("listAdd 호출 끝");
	}
	
	void listAdd2 (List<TraineeDTO> tList,TraineeDTO t) {
		System.out.println("listAdd2 호출됨");
//		t.setName(name);
//		t.setAge(age);
//		t.setPhone(phone);
//		t.setMajor(major);
		tList.add(t);
		
		System.out.println("listAdd2 호출 끝");
	}
	
	
	
	
	
	
	
}
