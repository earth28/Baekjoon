import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_15649 {
	public static int N, M;
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		if (depth == M) {	// 재귀 깊이가 M과 같아지면 배열 출력
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for (int i = 0; i < N; i++) {
			// 해당 값을 방문하지 않았다면
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);	// 다음 자식 노드 방문
				
				// 자식 노드 방문이 끝나고 돌아오면 방문 노드를 방문하지 않은 상태로 변경
				visit[i] = false;
			}
		}
	}
}
