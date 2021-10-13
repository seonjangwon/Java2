package day02_20211005;

public class Ex02_increaseOperstor {

	public static void main(String[] args) {
		// 증감 연산자
		int result = 0, var = 10;
		
		
		System.out.println("result1 : " + result + "  var : " + var);
		result = 10 + var++;
		System.out.println("result2 : " + result + "  var : " + var);
		result = 10 + var++;
		System.out.println("result3 : " + result + "  var : " + var); // r : 21 v : 12
		
		
		result = 0;
		var = 10;
		result = 10 + var--;
		System.out.println("result4 : " + result + "  var : " + var);
		result = 10 + var--;
		System.out.println("result5 : " + result + "  var : " + var);
		
		result = 0;
		var = 10;
		result = 10 + ++var;
		System.out.println("result6 : " + result + "  var : " + var); // r : 21 v : 11
		result = 10 + ++var;
		System.out.println("result7 : " + result + "  var : " + var); // r : 22 v : 12
		
		
		result = 0;
		var = 10;
		result = 10 + --var;
		System.out.println("result8 : " + result + "  var : " + var); // r : 19 v : 9
		result = 10 + --var;
		System.out.println("result9 : " + result + "  var : " + var); // r : 18 v : 8
		
		

	}

}
