import java.io.*;
import java.util.*;

public class num_24060 {
	static int[] temp;	// 배열 정렬할 임시 배열
	static int count = 0;
	static int K;
	static int result = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		temp = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, arr.length - 1);
		
		System.out.println(result);
	}
	
	static void merge(int[] arr, int left, int mid, int right) {
		int i = left, j = mid + 1, k = 0;
		
		// 배열 정렬
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}
			else {
				temp[k++] = arr[j++];
			}
		}
		
		// 남은 원소 temp 배열에 추가
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		
		while (j <= right) {
			temp[k++] = arr[j++];
		}
		
		k = 0;
		i = left;
		
		// temp를 원래 배열인 arr에 복사 및 count에 맞는 원소 찾기
		while (i <= right) {
			count++;
			
			if (count == K) {
				result = temp[k];
				break;
			}
			
			arr[i++] = temp[k++];
		}
	}
	
	private static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
}
