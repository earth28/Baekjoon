import java.io.*;
import java.util.*;

public class num_1010 {
	/*
	 * 동적계획법(Dynamic Programming) 사용 :
	 * 복잡한 문제를 더 작은 학위 문제로 나누어 해결하는 알고리즘 설계 기법
	 * 
	 * 처음에는 재귀만을 사용해서 시간초과
	 * 동적계회법을 사용하면 이전에 계산한 값을 저장(메모제이션) 가능, dp 배열을 사용하여 이미 계산된 조합 값 저장 후 재사용
	 * 이렇게 하면 중복 계산을 피할 수 있어 재귀적 방식만 사용할 때 보다 훨씬 효율적인 계산 가능
	 */
	static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(bf.readLine());
		
		while (T-- > 0) {
			st = new StringTokenizer(bf.readLine());
			
			int r = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			sb.append(combination(n, r)).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static int combination(int n, int r) {	// 조합의 성질 활용
		if (dp[n][r] > 0) {
			return dp[n][r];
		}
		
		if (n == r || r == 0) {
			return 1;
		}
		
		return dp[n][r] = combination(n-1, r-1) + combination(n-1, r);
	}
}