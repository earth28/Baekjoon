import java.util.*;

public class num_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {	// 배열 저장
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);	// 자바 정렬 메소드 활용
		
		/* 선택 정렬 (Selection Sort)
		 * 
		 * for (int i = 0; i < N-1; i++) {
		 * 		for (int j = i + 1; j < N; j++) {
		 * 			if (arr[i] > arr[j]) {
		 * 				int temp = arr[j];
		 * 				arr[j] = arr[i];
		 * 				arr[i] = temp;
		 * 			}
		 * 		}
		 * 	}
		 * 
		 * 	for (int val : arr) {
		 * 		System.out.println(val);
		 * 	}
		 */
		
		for (int i = 0; i < N; i++) {	// 배열 출력
			System.out.println(arr[i]);
		}
	}
}