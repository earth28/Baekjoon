import java.io.*;
import java.util.*;

public class num_15652 {
	public static int N, M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		
		dfs(1, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int at, int depth) {
		if (depth == M) {	// 재귀 깊이가 M과 같아지면 배열 출력
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		
		// at : 현재 위치
		for (int i = at; i <= N; i++) {
			arr[depth] = i;	// 중복을 허용하므로 i값을 인자로 넘겨 재귀호출
			dfs(i, depth + 1);
		}
	}
}