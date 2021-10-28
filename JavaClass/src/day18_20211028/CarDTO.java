package day18_20211028;

import java.util.Objects;

public class CarDTO {
	// 차량번호 차량종류 이름
	private int carNumber =0;
	private int carType =0;
	private String name ="";
	
	public CarDTO(){ // 기본
		
	}

	public CarDTO(int carNumber, int carType, String name) {
		this.carNumber = carNumber;
		this.carType = carType;
		this.name = name;
	}
	
	public CarDTO(int carType, String name) {
		this.carType = carType;
		this.name = name;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CarDTO [carNumber=" + carNumber + ", carType=" + carType + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(carNumber, carType, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarDTO other = (CarDTO) obj;
		return carNumber == other.carNumber && carType == other.carType && Objects.equals(name, other.name);
	}
	
	
}
