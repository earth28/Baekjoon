import java.util.*;
import java.io.*;

public class num_14888 {
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int[] op = new int[4];	// 각 연산자 개수를 저장할 배열
	public static int[] num;	// 숫자 배열
	public static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		num = new int[N];
		
		// 숫자 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// 연산자 입력
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(num[0], 1);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int number, int index) {
		if (index == N) {
			max = Math.max(max, number);
			min = Math.min(min, number);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (op[i] > 0) {	// 연산자 개수가 1개 이상인 경우
				op[i]--;	// 해당 연산자 1 감소
				
				switch (i) {
					case  0 :
						dfs(number + num[index], index + 1);
						break;
					case 1 :
						dfs(number - num[index], index + 1);
						break;
					case 2 :
						dfs(number * num[index], index + 1);
						break;
					case 3 :
						dfs(number / num[index], index + 1);
						break;
				}
				
				op[i]++;	// 재귀호출이 종료되면 다시 해당 연산자 개수 복구
			}
		}
	}
}