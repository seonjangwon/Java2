package day05_20211008;

import java.io.*;

public class Ex02_while {

	public static void main(String[] args) throws IOException {
		/*
		 * i 값이 123456이 될 때 반복문이 종료되도록 해보세요 
		 */
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean run = true;
		int i =1;
		while (run) {
			bw.write(String.valueOf(i)+"\n");
			i++;
			if (i == 12345)
				run = false;
		}
		
		bw.write(String.valueOf(i)); // while 조건이 끝이 안나서 실행 될리가 없는 코드
		bw.flush();
		
		
		
		bw.close();
		
		

	}

}
