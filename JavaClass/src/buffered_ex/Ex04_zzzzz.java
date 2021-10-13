package buffered_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04_zzzzz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = 0, num2 = 0, result = 0;
		String str = "";

		while ((str = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(str);
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			result = num1 + num2;

			bw.write(String.valueOf(result) + "\n");

		}
		bw.flush();

		bw.close();
		br.close();
	}
}