package day05_20211008;

import java.io.*;

public class Ex01_While {

	public static void main(String[] args) throws IOException {
		/*
		 *  이제부터 출력 입력은 버퍼로 한다
		 *  
		 *  while문
		 *  1부터 3까지 출력하
		 *  
		 *  
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = 0;
		i = Integer.parseInt(br.readLine());
		while (i<=3) {
//			System.out.println("while : "+i);
			bw.write("while : "+String.valueOf(i)+"\n");
			i++;
			bw.flush(); // 얘는 보낼 때 마다 사용
		}
//		i = 10;
		do { // 위에서 i가 4인데 밑에 while 조건은 i<=3이지만 do를 한번 실행을 하고 해서 do while : 4 는 출력
//			System.out.println("do while : "+i);
			bw.write("do while : "+String.valueOf(i)+"\n");
			i++;
			bw.flush();
		} while (i <=3);
		
		System.out.println("끝나고 : "+i);
		for (int j = 1; j<=3; j++) {
			System.out.println(j);
//			bw.write(String.valueOf(j));
		}
		
		
		bw.close(); // 얘는 맨 밑에 두고
		br.close();
		
		

	}

}
