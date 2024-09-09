import java.util.*;

public class num_2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {	// 배열 저장 및 배열값의 총합 구하기
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);	// 배열 정렬 메소드 사용
		
		System.out.println(sum/5);	// 평균 출력
		System.out.println(arr[2]);	// 중앙값이니 배열 인덱스 2의 값 출력
	}
}
