import java.io.*;
import java.util.*;

public class num_4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			int n = Integer.parseInt(bf.readLine());
			
			if (n == 0) {
				break;
			}

			sb.append(makePrime(n)).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static int makePrime(int n) {
		int count = 0;	// n보다 크고 2n보다 작거나 같은 소수 개수
		
		/*
		 * boolean default 값 : false
		 * 배열 크기 잘못 됐었음. 소수를 구하려는 범위가 n부터 2n 사이의 수이므로
		 * 배열의 크기는 2n이어야 함. 단, 0부터 시작하므로 2*n + 1로 배정.
		 */
		boolean prime[] = new boolean[2 * n + 1];
		
		prime[0] = prime[1] = true;	// true : 소수 아님, false : 소수
		
		//반복문 범위 잘못 됐었음. 먼저 2n 이하의 소수를 구해야하므로 i는 2부터 시작.
		for (int i = 2; i <= Math.sqrt(2 * n); i++) {	
			if (!prime[i]) {
				for (int j = i * i; j <= 2 * n; j += i) {
					prime[j] = true;
				}
			}
		}
		
		// n보다 커야 하므로 n+1부터 시작
		for (int i = n + 1; i <= 2 * n; i++) {
			if (!prime[i]) {
				count++;
			}
		}
		
		return count;
	}
}
