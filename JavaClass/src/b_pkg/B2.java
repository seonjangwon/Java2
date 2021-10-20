package b_pkg;

//소속 : b_pkg
//접근제한자 : public
public class B2 {

	public static void main(String[] args) {
		// B1 클래스 객체 생성
		// B1, B2는 같은 패키지에 소속 되어있기 때문에 
		// import를 쓰지 않아도 가능하다
		B1 b1 = new B1();
		
		b1.a="aa";// 같은 패키지라서 접근 가능
		b1.b="bb";
//		b1.c="cc"; // private이라서 접근 불가능
		
		B3 b3= new B3();
		
		
		
		
	}

}
