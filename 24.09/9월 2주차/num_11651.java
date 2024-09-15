import java.io.*;
import java.util.*;

// 문제 11650 변형 : y좌표 기준 오름차순 정렬
public class num_11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			// StirngTokenizer 생성 및 공백 기준 구분
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			else {
				return o1[1] - o2[1];
			}
		});
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.print(sb);
	}
}