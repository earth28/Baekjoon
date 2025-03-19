import java.util.*;
import java.io.*;

public class num_1920 {
	static int[] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		A = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);  # 이진탐색을 위한 배열 정렬
		
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[M];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < M; i++) {
			System.out.println(binarySearch(arr[i], 0, N - 1));
		}
	}

  # 이진탐색 코드
	static int binarySearch(int key, int low, int high) {
		int mid;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (key == A[mid]) {
				return 1;
			}
			else if (key < A[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return 0;
	}
}
