package day18_20211028;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class CarParkService {
	// 차량등록 가격등록 입차 출차 차량조회 전체차량조회

	// 차량등록
	// 메서드 이름 : carJoin
	// 리턴 타입 : Map<Integer, CarDTO>
	// 매개변수 : Map<Integer, CarDTO>
	// 차량종류 이름 입력
	// 차량번호 자동

	Map<Integer, CarDTO> carJoin(Map<Integer, CarDTO> cMap) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.경차 | 2.승용차 | 3.승합차");
		System.out.print("차량 종류 : ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.print("이룸 : ");
		String name = sc.nextLine();
		CarDTO c = new CarDTO(carType, name);
		c.setCarNumber(cMap.size() + 1); // 1부터 삭제는 없으니 사이즈로 가자

		System.out.println(name + "님 환영합니다.");
		System.out.println("차량번호 : " + c.getCarNumber());

		cMap.put(cMap.size() + 1, c);
		return cMap;
	}

	// 가격등록
	// 메서드 이름 : priceJoin
	// 리턴 타입 : Map<Integer, PriceInterface>
	// 매개변수 : Map<Integer, PriceInterface>
	// 차량종류(키값) 가격 입력
	//

	Map<Integer, PriceInterface> priceJoin(Map<Integer, PriceInterface> pMap) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.경차 | 2.승용차 | 3.승합차");
		System.out.print("차량 종류 : ");
		int carType = sc.nextInt();

		System.out.print("분당 가격 : ");
		int price = sc.nextInt();

		PriceInterface p = null;
		if (carType == 1) { // 괜히 쓰는건가
			p = new Price1DTO();
			p.price(price);
		} else if (carType == 2) {
			p = new Price2DTO();
			p.price(price);
		} else if (carType == 3) {
			p = new Price3DTO();
			p.price(price);
		}

		pMap.put(carType, p);
		return pMap;
	}

	// 입차
	// 메서드 이름 : carIn
	// 리턴 타입 : Map<Integer, CarParkDTO>
	// 매개변수 : Map<Integer, CarDTO>, Map<Integer, CarParkDTO>
	// 차량번호(DTO) 입차시간 입력
	// 자리번호 자동

	Map<Integer, CarParkDTO> carIn(Map<Integer, CarParkDTO> cpMap, Map<Integer, CarDTO> cMap, int parkNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("차량 번호 : ");
		int carNumber = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("m");

//		int time = sc.nextInt();
		int time = Integer.parseInt(sdf.format(new Date()));// 분 단위로 교체
		System.out.println("입차 시간 : "+time+"분");
		if (cpMap.size() < 3) { // 사이즈로 해두면 자리번호는 늘어나도 3개 이상 되면 막겠지
			CarParkDTO cp = new CarParkDTO(parkNumber, time, cMap.get(carNumber));

			System.out.println(cMap.get(carNumber).getName() + "님 환영합니다.");
			System.out.println("차량 번호 : " + carNumber);
			System.out.println("자리 번호 : " + parkNumber + " 입차 되었습니다.");
			cpMap.put(parkNumber, cp);
		} else {
			System.out.println("주차장에 자리가 없습니다.");
		}
		return cpMap;
	}

	// 출차
	// 메서드 이름 : carOut
	// 리턴 타입 : Map<Integer, CarParkDTO>
	// 매개변수 : Map<Integer, CarDTO>, Map<Integer, CarParkDTO>, Map<Integer,
	// PriceInterface>
	// 차량번호(DTO) 입차시간 입력
	// 자리번호 자동

	Map<Integer, CarParkDTO> carOut(Map<Integer, CarParkDTO> cpMap, Map<Integer, PriceInterface> pMap) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자리 번호 : ");
		int parkNumber = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("m");

//		int time = sc.nextInt();
		int time = Integer.parseInt(sdf.format(new Date()));// 분 단위로 교체
		System.out.println("출차 시간 : "+time+"분");
		int inTime = cpMap.get(parkNumber).getTime();
		int price = pMap.get(cpMap.get(parkNumber).getCar().getCarType()).priceOut();

		int money = (time - inTime) * price;
		System.out.println("주차비 : " + money + "원 입니다.");

		cpMap.remove(parkNumber);
		return cpMap;
	}

	// 차량 조회
	// 메서드 이름 : carSearch
	// 리턴 타입 : void
	// 매개변수 :Map<Integer, CarParkDTO>, Map<Integer, PriceInterface>
	// 차량번호(DTO) 입차시간 입력
	// 자리번호 자동

	void carSearch(Map<Integer, CarParkDTO> cpMap, Map<Integer, PriceInterface> pMap) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자리 번호 : ");
		int parkNumber = sc.nextInt();

		SimpleDateFormat sdf = new SimpleDateFormat("m");

//		int time = sc.nextInt();
		int time = Integer.parseInt(sdf.format(new Date()));// 분 단위로 교체
		System.out.println("현재 시간 : "+time+"분");

		int inTime = cpMap.get(parkNumber).getTime();
		int price = pMap.get(cpMap.get(parkNumber).getCar().getCarType()).priceOut();

		int money = (time - inTime) * price;
		System.out.println("현재 주차비 : " + money + "원 입니다.");

	}

	// 전체 차량 조회
	// 메서드 이름 : carList
	// 리턴 타입 : void
	// 매개변수 :Map<Integer, CarParkDTO>, Map<Integer, PriceInterface>
	// 차량번호(DTO) 입차시간 입력
	// 자리번호 자동

	void carList(Map<Integer, CarParkDTO> cpMap, Map<Integer, PriceInterface> pMap) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("m");

//		int time = sc.nextInt();
		int time = Integer.parseInt(sdf.format(new Date()));// 분 단위로 교체
		System.out.println("현재 시간 : "+time+"분");

		for (Integer parkNumber : cpMap.keySet()) {
			int inTime = cpMap.get(parkNumber).getTime();
			int price = pMap.get(cpMap.get(parkNumber).getCar().getCarType()).priceOut();

			int money = (time - inTime) * price;
			System.out.println("현재 자리 : " + parkNumber + " 입니다.");
			System.out.println("현재 주차비 : " + money + "원 입니다.");
		}

	}

}
