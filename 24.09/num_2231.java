import java.util.*;

public class num_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int result = 0;	// 생성자
		
		for (int i = 0; i < N; i++) {
			int number = i;
			int sum = 0;	// 각 자릿수 합 저장할 변수
			
			while (number != 0) {
				sum += number % 10;	// 각 자릿수 더하기
				number /= 10;
			}
			
			if (sum + i == N) {	// 생성자 찾으면 반복문 종료
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}