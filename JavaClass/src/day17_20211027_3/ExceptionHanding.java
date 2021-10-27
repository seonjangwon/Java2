package day17_20211027_3;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHanding {

	public static void main(String[] args) {
		// 
		try {
		List<String> list1 = new ArrayList<>();
		list1.add("aa");
		list1.add("bb");
		
		
		for (int i = 0; i<=list1.size();i++) {
			System.out.println(list1.get(i));
		}
		} catch(IndexOutOfBoundsException e) { // 익셉션이 있을 때만 
			System.out.println("인덱스 초과 Exception 발생");
			e.printStackTrace();
		}catch(Exception e){ // catch는 여러 개 사용가능
			
		} finally {
			System.out.println("여기는 항상 출력됩니다.");
		}
		System.out.println("리스트 출력");
	}

}
