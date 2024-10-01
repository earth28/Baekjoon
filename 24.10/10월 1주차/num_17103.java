import java.io.*;
import java.util.*;

public class num_17103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 테스트케이스마다 소수를 구하면 시간초과이므로, 미리 최대 범위 내의 소수를 구함
		boolean[] prime = new boolean[1000001];
		
		prime[0] = prime[1] = true;
		
		// 소수는 false
		for (int i = 2; i * i <= 1000000; i++) {
			if(!prime[i]) {
				for (int j = i + i; j <= 1000000; j += i) {
					prime[j] = true;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			int count = 0;
			
			// 순서만 다르고 두 소수가 같은 경우는 같은 파티션이므로 temp/2
			for (int j = 2; j <= temp / 2; j++) {
				if (!prime[j] && !prime[temp - j]) count++;	// temp를 이루는 두 수가 모두 소수일 때 count 증가
			}
			
			sb.append(count).append('\n');
		}
		
		System.out.println(sb);
	}
}
