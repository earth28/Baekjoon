import java.io.*;
import java.util.*;

public class num_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		// HashMap에 저장되어 있다면 value 값 1 증가
		for (int i = 0; i < N; i++) {
			String key = bf.readLine();
			if (map.containsKey(key)) {
				int value = map.get(key);
				value++;
				map.put(key, value);
			}
			else {
				map.put(key, 1);
			}
		}
		
		int count = 0;
		ArrayList<String> arr = new ArrayList<>();	// 사전순 정렬 위해 ArrayList 생성
		
		// HashMap에 찾는 값이 저장되어 있다면 count 값 증가 및 arr에 저장
		for (int i = 0; i < M; i++) {
			String key = bf.readLine();
			if (map.containsKey(key)) {
				count++;
				arr.add(key);
			}
		}
		
		sb.append(count).append('\n');
		
		Collections.sort(arr);	// 사전순 정렬
		
		for (String s : arr) {
			sb.append(s).append('\n');
		}
		
		System.out.println(sb);
	}
}