import java.io.*;
import java.util.*;

public class num_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<String>(N);
		String[] arr = new String[M];
		
		for (int i = 0; i < N; i++) {
			set.add(bf.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			arr[i] = bf.readLine();
		}
		
		int count  = 0;
		
		for (String val : arr) {
			if (set.contains(val)) {
				count++;
			}
		}
		
		/* ※ HashMap 활용한 방법
		 * 
		 * Map<String, Integer> map = new HashMap<>();
		 * 
		 * for (int i = 0; i < N; i++) {
		 * 		map.put(bf.readline(), 0);
		 * }
		 * 
		 * int count = 0;
		 * 
		 * for (int i = 0; i < M; i++) {
		 * 		if (map.containsKey(bf.readline())) count++;
		 * }
		 */
		
		System.out.println(count);
		
		
	}
}