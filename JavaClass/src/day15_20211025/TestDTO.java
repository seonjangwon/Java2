package day15_20211025;

public class TestDTO {
	
	private int number=0;
	private String val="";
	private String va2="";
	
	TestDTO () {
		
	}

	public TestDTO(int number, String val, String va2) {
		super();
		this.number = number;
		this.val = val;
		this.va2 = va2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getVa2() {
		return va2;
	}

	public void setVa2(String va2) {
		this.va2 = va2;
	}

	@Override
	public String toString() {
		return "TestDTO [number=" + number + ", val=" + val + ", va2=" + va2 + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
