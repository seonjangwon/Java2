package day10_20211018;

public class Ex00_BJA15596_c {
	// 백준 알고리즘 15596번 클래스
	Ex00_BJA15596_c () {
		
	}
	
	long sum(int[] a) {
        long ans = 0;
        for (int i=0;i<a.length;i++) {
        	ans+=a[i];
        }
        return ans;
    }

}
