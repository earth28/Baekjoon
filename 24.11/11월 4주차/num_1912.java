import java.io.*;
import java.util.*;

public class num_1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// dp[0]은 첫 원소로 이전에 탐색할 것이 없기 때문에 arr[0]와 같으므로 arr[0]으로 초기화. max도 첫 번째 원소로 초기화
		dp[0] = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < N; i++) {
			// (이전 dp + 현재 arr값)과 현재 arr 값 중 큰 값을 dp에 저장
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			max = Math.max(max, dp[i]);	// 최댓값 갱신
		}
		
		System.out.println(max);
	}
}
