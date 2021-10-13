package day05_20211008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex00_zzz {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test = 0, num1 = 0, num2 = 0;
        String str = "";
        test = Integer.parseInt(br.readLine());
        
        
        for(int i = 1; i<=test; i++){
        	str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str);
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(num1+num2)+"\n");
            bw.flush();
        }
        
        bw.close();
        br.close();
    }
}