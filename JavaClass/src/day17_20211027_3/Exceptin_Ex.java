package day17_20211027_3;

public class Exceptin_Ex {

	public static void main(String[] args) {
		// 정수간의 a/b와 같은 나눗셈을 할 때 b에 0이 오면 발생하는 예외를 확인하고
		// 예외처리하는 코드를 작성해보세요
		// 예외 발생시 0으로 나눌 수 없습니다 출력할것.

		try {
			int a = 3;
			int b = 0;
			int c = a / b;
			System.out.println(c);
			
			
			String var1 =null;
			System.out.println(var1.equals("bb"));

		} catch (ArithmeticException e) {
			System.out.println("예외 발생 0으로 나눌수 없습니다.");
		}catch (NullPointerException e) {
			System.out.println("null 어떠면 좋니");
		}

	}

}
