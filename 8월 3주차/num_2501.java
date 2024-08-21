import java.util.*;

public class num_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				arr.add(i);
			}
		}
		
		if (arr.size() < K) {
			System.out.print(0);
		}
		else {
			System.out.print(arr.get(K-1));	// 인덱스는 0부터 시작
		}
	}
}