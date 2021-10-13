package buffered_ex;

import java.io.*;

public class Ex02_BufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = 1;
		String var = "";
		
//		var = br.readLine(); // 이건 되는데
//		num = Integer.parseInt(br.readLine()); // 이건 왜 안될까
		bw.write("hello world\n");
//		bw.write(1); // 이새끼는 왜 숫자 출력이 안되냐
		bw.write(var+"\n"); // 이건 되는데
		bw.newLine(); // newLien(); 메서드 또는 \n 사용해서 다음줄로
//		bw.write(num);
		bw.write(String.valueOf(num));
		
		bw.flush();
		bw.close();
		br.close();
	
	}
}
