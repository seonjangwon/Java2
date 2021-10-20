package b_pkg;

//소속 : b_pkg
//접근제한자 : public
public class B1 {
	
	//접근 제한자를 스지 않으면 default
	// 클래스가 public이라도 각각 선언을 해줘야 다른 패키지에서 사용가능
	String a;
	
	// public 접근제한자를 갖는 필드
	public String b="";
	
	//private 접근제한자를 갖는 필드
	private String c="";// 같은 클래스에서만 사용 가능
	
	
	void method1() {
		c = "ccc";// 같은 클래스 안이라 사용가능
	}
	
	
	

}
