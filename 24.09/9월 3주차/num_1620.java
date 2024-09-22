import java.io.*;
import java.util.*;

public class num_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// HashMap 하나면 반복문을 여러번 돌아야 해서 시간초과
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		// key, value 순서 다르게 하여 반복문 최소화
		for (int i = 1; i <= N; i++) {
			String pocketmon = bf.readLine();
			map1.put(i, pocketmon);
			map2.put(pocketmon, i);
		}
		
		for (int i = 0; i < M; i++) {
			String s = bf.readLine();
			
			// 아스키코드값 활용하여 정수인지 판별
			if (49 <= s.charAt(0) && s.charAt(0) <= 57) {
				int key = Integer.parseInt(s);
				sb.append(map1.get(key));
			}
			else {
				sb.append(map2.get(s));
			}
			
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}