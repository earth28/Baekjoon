import java.io.*;
import java.util.*;

public class num_11650 {
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
		
		/*
		 * 방법 1. Override 사용
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					// 첫 번째 원소 값이 같다면 두 번째 원소 값을 기준으로 오름차순 정렬
					return o1[1] - o2[1];
				}
				else {
					// 첫 번째 원소 기준 오름차순 정렬
					return o1[0] - o2[0];
				}
			}
		});
		*/
		
		// 방법 2-1. 람다식 사용
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o1[1] - o2[1];
			}
			else {
				return o1[0] - o2[0];
			}
		});
		
		/*
		 * 방법 2-2. Arrays.sort(2차원 배열, (o1, o2) -> (조건문 ? true일 때 정렬 순서 : false일 때 정렬 순서)):
		 * Arrays.sort(arr, (o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));
		 */
		
		for (int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}
		
		System.out.print(sb);
	}
}