import java.io.*;
import java.util.*;

public class num_1149 {
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	
	static int[][] Cost;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Cost = new int[N][3];
		dp = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			Cost[i][Red] = Integer.parseInt(st.nextToken());
			Cost[i][Green] = Integer.parseInt(st.nextToken());
			Cost[i][Blue] = Integer.parseInt(st.nextToken());
		}
		
		// dp 첫 번째 값은 각 색상 비용의 첫 번째 값으로 초기화
		dp[0][Red] = Cost[0][Red];
		dp[0][Green] = Cost[0][Green];
		dp[0][Blue] = Cost[0][Blue];
		
		System.out.println(Math.min(Paint_cost(N - 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
	}
	
	static int Paint_cost(int N, int color) {
		// 탐색하지 않은 배열이라면
		if (dp[N][color] == 0) {
			
			// color에 따라 이전 집의 서로 다른 색을 재귀호출하여 최솟값과 현재 집의 비용을 더하여 dp에 저장
			if (color == Red) {
				dp[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
			}
			else if (color == Green) {
				dp[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
			}
			else {
				dp[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + Cost[N][Blue];
			}
		}
		
		return dp[N][color];
	}
}
