package day18_20211028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarParkMain {

	public static void main(String[] args) {
		// 주자창 프로젝트
		Scanner sc = new Scanner(System.in);

		Map<Integer, CarDTO> cMap = new HashMap<>();
		Map<Integer, PriceInterface> pMap = new HashMap<>();
		Map<Integer, CarParkDTO> cpMap = new HashMap<>();

		CarParkService cps = new CarParkService();

		int choice = 0;
		boolean run = true;
		int parkNumber = 1;

		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1.차량등록 | 2.가격등록 | 3.입차 | 4.출차 | 5.차량조회 | 6.전체 차량 | 7.종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			switch (choice) {

			case 1: {// 차량 등록
				cMap = cps.carJoin(cMap);
				break;
			}
			case 2: {// 가격 등록
				pMap = cps.priceJoin(pMap);
				break;
			}
			case 3: {// 입차
				cpMap = cps.carIn(cpMap, cMap, parkNumber);
				parkNumber++;
				break;
			}
			case 4: {// 출차
				cpMap = cps.carOut(cpMap, pMap);
				break;
			}
			case 5: {// 차량조회
				cps.carSearch(cpMap, pMap);
				break;
			}
			case 6: {// 전체차량
				cps.carList(cpMap, pMap);
				break;
			}
			case 7: {// 종료
				System.out.println("종료합니다.");
				run=false;
				break;
			}
			default: {
				break;
			}
			} // switch
		} // while
	}

}
