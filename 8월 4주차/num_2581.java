import java.util.*;

public class num_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int sum = 0;
		
		for (int i = M; i <= N; i++) {	// M <= N 으로 적었어서 무한루프에 빠졌었음
			int count = 0;
			
			for (int j = 1; j <= i; j++) {	// 범위 내 수의 약수 구하기, 약수면 count 증가
				if (i % j == 0) {
					count++;
				}
			}
			
			if (count == 2) {	// 약수가 2개, 즉 소수라면
				arr.add(i);
				sum += i;	// 소수들의 합
			}
		}
		
		if (arr.size() == 0) {	// 소수가 없다면
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
		System.out.println(arr.get(0));
		}
	}
}