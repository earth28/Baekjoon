import java.util.*;

public class num_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;	// 세 수의 합
		int tmp = 0;	// 근사치 값 저장해두는 변수
		
		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				for (int k = j+1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					// 세 수의 합이 이전 근사치 값보다 크고, M보다 작거나 같으면 근사치 값 업데이트
					if (tmp < sum && sum <= M) {
						tmp = sum;
					}
				}
			}
		}
		
		System.out.println(tmp);
	}
}
