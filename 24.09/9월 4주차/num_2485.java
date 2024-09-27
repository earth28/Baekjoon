import java.io.*;
import java.util.*;

public class num_2485 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		int GCD = 0;	// 나무 사이 간격의 초기값이라서 0
		/*
		 * GCD(n,0) = n.
		 * 0은 모든 수의 배수이므로, 모든 수를 약수로 가진다. 따라서 n과 0의 최대공약수는 n
		 */
		
		for (int i = 0; i < N-1; i++) {
			int distance = arr[i+1] - arr[i];
			GCD = getGCD(distance, GCD);
		}
		
		System.out.println((arr[N-1]-arr[0])/GCD+1-(arr.length));
	}
	
	public static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}
}