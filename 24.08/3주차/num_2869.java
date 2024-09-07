import java.util.*;

public class num_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// 낮에 올라갈 수 있는 거리
		int B = sc.nextInt();	// 밤에 미끄러지는 길이
		int V = sc.nextInt();	// V 미터의 나무
		
		/* 시간 초과
		int day = 1;
		int length = A;	// 1일차 낮에 이동하는 거리
		
		while (length < V) {
			length = length - B;
			day++;	// 일수 증가
			length = length + A;
		}
		*/
		
		/* 정점에 도달 시 미끄러지지 않는다는 조건 때문에
		 * V-B -V/(A-B)의 나머지가 A-B보다 작다면 다음날 A만큼 올라야 함- 를 해야 함
		 * 결과적으로 (V - B) / (A - B)의 몫이 최소한의 일수가 됨
		 */
		
		int day = (V - B) / (A - B);
		
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.print(day);
	}
}
