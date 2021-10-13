package day06_20211012;


public class Ex03_WhileEx2 {

	public static void main(String[] args) {
		/*
		 * 1- 2+3-4~~~100
		 * 
		 */
		int sum=0;
		int num=0;
		int count=1;
		int s=1;
		boolean run = true;
		while (run) {
			sum += num;
			if (sum >= 100) {
				run=false;
				
			}else {
				num = s *count;
				s= -s;
				count++;
			}
		}
		System.out.println("숫자: "+num);
		System.out.println("합계: "+sum);
	}

}
