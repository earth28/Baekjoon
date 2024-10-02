/*
 * 약수의 개수가 홀수인 경우, 창문이 열린 채 종료
 * 즉, n까지의 숫자 중 약수의 개수가 홀수인 숫자를 찾으면 됨
 * 이때, 약수의 개수가 홀수이려면 같은 수를 제곱해 나오는 수여야 하므로 제곱수 밖에 없음
 */

import java.io.*;
import java.util.*;

public class num_13909 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int count = 0;	// 열려있는 창문 수
		
		for (int i = 1; i * i <= n; i++) {
			count++;
		}
		
		System.out.println(count);
	}
}