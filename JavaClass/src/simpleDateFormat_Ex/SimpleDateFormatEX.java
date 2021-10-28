package simpleDateFormat_Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEX {

	public static void main(String[] args) {
		// 연습용
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("h");
		SimpleDateFormat sdf2 = new SimpleDateFormat("m");
		
		String hour =sdf1.format(new Date());
		String min =sdf2.format(new Date());
		
		System.out.println(hour);
		System.out.println(min);
		
	}

}
