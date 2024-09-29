import java.io.*;
import java.util.*;

public class num_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		for (int i = M; i <= N; i++) {
			make_prime(i, sb);
		}
		
		System.out.println(sb);
	}
	
	public static void make_prime(int num, StringBuilder sb) {
		if (num < 2) {
			return;	// 2 미만의 숫자는 소수가 아니므로 return
		}
		
		int count = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;	// 나누어떨ㅇ지면 소수 아님
				break;
			}
		}
			
		if (count == 0) {	// 소수인 경우
			sb.append(num).append('\n');
		}
	}
}