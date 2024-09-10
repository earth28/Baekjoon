import java.util.*;

public class num_25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 응시자 수
		int K = sc.nextInt();	// 상을 받는 사람의 수
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {	// 배열 저장
			arr[i] = sc.nextInt();
		}
		
		/* 선택정렬(Selection Sort)
		 * 맨 앞의 인덱스부터 차례대로 값을 확인
		 * n, n+1을 비교하고 조건을 만족하면 서로의 위치를 교체하는 방식
		 */
		
		for (int i = 0; i < arr.length; i++) {	// 내림차순 정렬
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(arr[K-1]);	// 상을 받는 사람 중 최솟값을 출력
	}
}