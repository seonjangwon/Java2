package day17_20211027_3;

import java.util.Objects;

public class TestDTO {
	
	private String a="";
	private String b="";
	
	public TestDTO () {
		
	}

	public TestDTO(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "TestDTO [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestDTO other = (TestDTO) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b);
	}
	
	
	
	
	
	
	
	
	
	
}
