package day18_20211028;

import java.util.Objects;

public class CarParkDTO {
	// 자리번호 입차시간 차량DTO(차량번호 차량종류)
	private int parkNumber =0;
	private int time = 0;
	private CarDTO car =null;
	
	public CarParkDTO(int parkNumber, int time, CarDTO car) {
		super();
		this.parkNumber = parkNumber;
		this.time = time;
		this.car = car;
	}

	public int getParkNumber() {
		return parkNumber;
	}

	public void setParkNumber(int parkNumber) {
		this.parkNumber = parkNumber;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public CarDTO getCar() {
		return car;
	}

	public void setCar(CarDTO car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarparkDTO [parkNumber=" + parkNumber + ", time=" + time + ", car=" + car + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(car, parkNumber, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarParkDTO other = (CarParkDTO) obj;
		return Objects.equals(car, other.car) && parkNumber == other.parkNumber && time == other.time;
	}
	
	
	
}
