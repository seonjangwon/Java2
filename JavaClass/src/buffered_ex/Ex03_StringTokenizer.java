package buffered_ex;

import java.util.StringTokenizer;
import java.io.*;

public class Ex03_StringTokenizer {

	public static void main(String[] args) throws IOException {
		/*
		 * StringTokenizer을 연습해보자
		 * 
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = ("1 2 3 4");
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		StringTokenizer st = new StringTokenizer(str);
		num1 = Integer.parseInt(st.nextToken());
		num2 = Integer.parseInt(st.nextToken());
		num3 = Integer.parseInt(st.nextToken());
		num4 = Integer.parseInt(st.nextToken());
//		bw.write(st.nextToken());
		bw.write(String.valueOf(num1+num2+num3+num4));
		bw.flush();

		bw.close();

	}

}
