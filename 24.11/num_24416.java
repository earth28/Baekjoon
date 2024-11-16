import java.io.*;
import java.util.*;

public class num_24416 {
	public static int n;
	public static int cnt = 0;
	public static int count = 0;
	public static int[] f;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		f = new int[n];
		
		fib(n);
		fibonacci(n);
		
		System.out.println(cnt + " " + count);
	}
	
	// 피보나치 수 재귀 호출 코드
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			cnt++;	// 코드 1 실행횟수
			return 1;
		}
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	// 피보나치 수 동적계획법 코드
	public static int fibonacci(int n) {
		f[0] = 1;
		f[1] = 1;
		
		for (int i = 2; i < n; i++) {
			count++;	// 코드 2 실행횟수
			f[i] = f[i - 1] + f[i - 2];
		}
		
		return f[n - 1];	// 배열 인덱스는 0부터 시작
	}
}
