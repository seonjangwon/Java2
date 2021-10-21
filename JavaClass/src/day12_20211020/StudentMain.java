package day12_20211020;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 객체를 담을 수 있는 ArrayList 선언
		List<Student> studentlist = new ArrayList<>();
		
		// Student 객체선언
		
		Student stu1 = new Student();
		stu1.name="학생1";
		stu1.age=27;
		stu1.studentNumber="20211234";
		
		Student stu2 = new Student("학생2",20,"20211111");
		
		// 리스트에 객체를 저장
		studentlist.add(stu1);
		studentlist.add(stu2);
		
		// 객체가 가지고 있는 필드 값 출력
		System.out.println(studentlist.get(0).name);
		System.out.println(studentlist.get(1).name);
		
		
		// stu1이 가지고 있는 (즉 ,0번인덱스에 담긴) view() 메서드 호출
		studentlist.get(0).view();
		System.out.println(studentlist.get(0).toString());
		
		// studentlist에 담긴 stu2의 이름 변경
		studentlist.get(0).name ="학생 2 이름 변경";
		
		
		// foreach로 출력해보기
		for(Student s: studentlist) { // 실제 리스트에 들어있는 데이터 타입
			System.out.println(s.name);
			System.out.println(s.toString());
			s.view();
		}
		
		//for문
		
		for (int i=0;i<studentlist.size();i++) {
			System.out.println(studentlist.get(i).name);
			System.out.println(studentlist.get(i).toString());
			studentlist.get(i).view();
		}
		
		
		

	}

}
