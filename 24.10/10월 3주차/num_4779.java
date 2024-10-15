import java.io.*;
import java.util.*;

public class num_4779 {
	static int n;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		
		while ((s = br.readLine()) != null) {
			n = Integer.parseInt(s);
			int len = (int) Math.pow(3, n);	// -가 3^n개 있는 문자열의 길이
			
			sb = new StringBuilder();
			
			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			
			cantor(0, len);	// 시작 인덱스, 길이
			System.out.println(sb);
		}
	}
	
	public static void cantor(int start, int size) {
		// 최소 단위
		if (size == 1) return;
		
		int newSize = size / 3;
		
		// 문자열 3등분 하고, 중간 부분 공백으로 교체
		for (int i = start + newSize; i < start + 2 * newSize; i++) {
			sb.setCharAt(i, ' ');
		}
		
		// 재귀함수 사용
		cantor(start, newSize);
		cantor(start + 2 * newSize, newSize);
	}
}
