import java.util.*;
import java.io.*;

public class num_14889 {
	public static int N;
	public static int[][] map;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		combi(0, 0);
		
		System.out.println(min);
	}
	
	// index : 인덱스, count : 조합 개수(=재귀 깊이)
	static void combi(int index, int count) {
		// 팀 조합이 완성될 경우
		if (count == N / 2) {
			diff();	// 방문한 팀과 방문하지 않은 팀을 나누어 각 팀의 점수를 구한 뒤 최솟값 찾음
			return;
		}
		
		for (int i = index; i < N; i++) {
			if (!visit[i]) {	// 방문하지 않았따면
				visit[i] =  true;
				combi(i + 1, count + 1);
				visit[i] = false;	// 재귀가 끝나면 비방문으로 변경
			}
		}
	}
	
	// 두 팀의 능력차 계싼
	static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// i번째 사람과 j번째 사람이 true라면 team_start에 점수 합산
				if (visit[i] == true && visit[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				
				// i번째 사람과 j번째 사람이 false라면 team_link에 점수 합산
				else if (visit[i] == false && visit[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		
		// 두 팀의 점수차 (절댓값)
		int val = Math.abs(team_start - team_link);
		
		// 점수차가 0이라면 최솟값이므로 더이상 탐색하지 않고 종료
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}
