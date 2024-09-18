import java.io.*;
import java.util.*;

public class num_18870 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];	// 원본 배열
		int[] sorted = new int[N];	// 정렬된 배열
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
		
		// 배열 입력
		for (int i = 0; i < N; i++) {
			arr[i] = sorted[i] = sc.nextInt();
		}
		
		Arrays.sort(sorted);
		
		// 배열 압축값을 HashMap에 저장
		int rank = 0;
		
		for (int val : sorted) {
			if (!rankMap.containsKey(val)) {	// 중복되지 않는 원소만 map에 저장
				rankMap.put(val, rank++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		// 원본 배열의 순서대로 해당 압축 배열 출력
		for (int val : arr) {
			sb.append(rankMap.get(val)).append(' ');
		}
		
		System.out.println(sb);
	}
}
