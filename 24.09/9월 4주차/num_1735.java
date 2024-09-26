import java.io.*;
import java.util.*;

public class num_1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		int a3 = a1 * b2 + a2 * b1;
		int b3 = b1 * b2;
		
		int GCD = getGCD(a3, b3);
		
		System.out.println(a3/GCD + " " + b3/GCD);
	}
	
	/*
	 * 유클리드 호제법 : 2개의 자연수 또는 정식의 최대공약수를 구하는 알고리즘의 하나
	 * 2개의 자연수(또는 정식) a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a > b),
	 * a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
	 * 이 성질에 따라 b를 r로 나눈 나머지 r'을 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가
	 * 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
	 */
	
	public static int getGCD(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return getGCD(b, a % b);
	}
}