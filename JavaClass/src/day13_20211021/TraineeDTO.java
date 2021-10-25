package day13_20211021;

// DTO(Date Transfer Object)
// VO(Value Object)
public class TraineeDTO {
	
	private String name = ""; // 이름
	private int age = 0; // 나이
	private String phone = ""; // 전화번호 - 도 넣어야해?
	private boolean major = false; // 전공
	
	TraineeDTO (){ // 기본기본
		
	}

	public TraineeDTO(String name, int age, String phone, boolean major) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.major = major;
	}
	
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isMajor() {
		return major;
	}

	public void setMajor(boolean major) {
		this.major = major;
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "Trainee [name=" + name + ", age=" + age + ", phone=" + phone + ", major=" + major + "]";
	}
	
	
}
