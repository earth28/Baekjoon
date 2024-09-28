import java.io.*;
import java.util.*;

public class num_4134 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < n; i++) {
			long prime = Long.parseLong(bf.readLine());
			
			while (true) {
				long count = 0;
				
				for (int j = 2; j <= Math.sqrt(prime); j++) {
					if (prime % j == 0) {	// 소수 아님
						count++;
						break;
					}
				}
				
				if (count == 0) {	// 입력받은 수가 소수
					if (prime == 0 || prime == 1) {
					// 0 또는 1은 소수에 포함되지 않으므로 이보다 큰 소수는 2
						prime = 2;
					}
					sb.append(prime).append('\n');
					break;
				}
				
				prime++;	// 입력받은 수가 소수가 아니므로 1씩 증가시키며 입력받은 수보다 큰 소수를 찾음
			}
		}
		
		System.out.println(sb);
	}
}