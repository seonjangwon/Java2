package a_pkg;

// 서로 다른 패키지에 소속되어 있기 때문에
// A1클래스에 B1클래스를 사용하려면 import를 사용해야 함
import b_pkg.B1;


// 소속 : a_pkg
// 접근제한자 : public
public class A1 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		
		// not visiable 보이지 않는다(접근이 불가능하다)
//		b1.a1 = "aa";
		
		b1.b="bb";
		
		//private 접근제한자 사용
//		b1.c="cc";
		
		// 다른패키지에 소속된 A1클래스가
		// default 로 지정한 B3를 사용할 수 있는지
		// default 는 같은 패키지에서만 접근이 가능해서 객체를 못만든다
//		B3 b3= new B3();
		
		
	}
}