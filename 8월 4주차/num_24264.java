import java.util.*;

public class num_24264 {
	public static void main(String[] args) {
		/* 문제에 주어진 코드는 이중 반복문.
		 * 죽, 수행횟수는 n*n = n^2, 수행 시간은 n의 차수인 2
		 * 시간 복잡도 => O(n^2)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 1 <= n <= 500,000 이므로 int 범위를 넘어서기 떄문에 long으로 선언
		long N = sc.nextLong();
		
		System.out.println(N *N);
		System.out.println(2);
	}
}