import java.util.*;

public class num_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;	// 지나가는 방의 수
		int range = 2;	// 범위 중 최솟값
		
		/* 방 개수는 다음 층으로 갈수록 6개씩 늘어남
		 * 1 : 1
		 * 2 : 2 ~ 7 (+6)
		 * 3 : 8 ~ 19 (+12)
		 * .
		 * .
		 * .
		 * 와 같은 규칙 존재
		 */
		
		if (N == 1) {
			System.out.print(1);
		}
		else {
			while (range <= N) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}
	}
}