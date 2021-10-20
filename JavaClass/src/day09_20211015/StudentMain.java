package day09_20211015;

public class StudentMain {

	public static void main(String[] args) {
		// 
		
		Student st1 = new Student();
		System.out.println("st1 시작");
		st1.name = "이름";
		System.out.println(st1.name);
		st1.num = "14";
		System.out.println(st1.num);
		st1.var = "학학과과";
		System.out.println(st1.var);
		st1.age = 26;
		System.out.println(st1.age);
		System.out.println("st1 끝");
		
		Student st2 = new Student("이름","14","학과",27);
		System.out.println("st2 시작");
		System.out.println(st2.name);
		System.out.println(st2.num);
		System.out.println(st2.var);
		System.out.println(st2.age);
		System.out.println("st2 끝");
		
		Student st3 = new Student("이름", "14");
		System.out.println("st3 시작");
		System.out.println(st3.name);
		System.out.println(st3.num);
		System.out.println("st3 끝");
		Student st4 = new Student("14","학과",27);
		System.out.println("st4 시작");
		System.out.println(st4.num);
		System.out.println(st4.var);
		System.out.println(st4.age);
		System.out.println("st4 끝");

	}

}
