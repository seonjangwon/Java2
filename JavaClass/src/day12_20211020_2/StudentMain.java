package day12_20211020_2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// Student 객체를 담을 수 잇는 ArrayList 선언
		List<Student> stuList= new ArrayList<>();

		Student stu1 = new Student();

		// stu1 객체의 name 필드값 저장
		// stu1.name = "학생1"; (X)
		stu1.setName("학생1");
		

		// stu1 객체의 name 필드값 출력
		// System.out.println(stu1.Name);
		System.out.println(stu1.getName());
		
		stu1.setAge(22);
		stu1.setStudentNumber("2021123");		
		
		// stu1 객체를 stuList에 저장
		stuList.add(stu1);
		
		Student stu2 = new Student("학생2",20,"2021111");
		
		// stu2 객체를 stuList에 저장
		stuList.add(stu2);
		
		
		// for문을 사용하여 studentNumber 출력
		for (int i=0;i<stuList.size();i++) {
			System.out.println("학생 넘버");
			System.out.println(stuList.get(i).getStudentNumber());
			System.out.println("toString");
			System.out.println(stuList.get(i).toString());
			System.out.println("아무것도 없다");
			System.out.println(stuList.get(i));
		}
		
		// foreach 사용
		for (Student s : stuList) {
			System.out.println("foreach");
			System.out.println("학생 넘버");
			System.out.println(s.getStudentNumber());
			System.out.println(s.toString());
			System.out.println(s);
		}

	}

}
