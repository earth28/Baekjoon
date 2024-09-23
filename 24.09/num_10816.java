import java.io.*;
import java.util.*;

public class num_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		
		int count = 1;
		st = new StringTokenizer(bf.readLine());
		
		for (int i = 0; i < N; i++) {
			String key = st.nextToken();
			
			// key값이 이미 HashMap에 저장되어 있다면 key의 value 값 1 늘려 다시 저장
			if (map.containsKey(key)) {
				int value = map.get(key);
				value += 1;
				map.put(key, value);
			}
			else {
				map.put(key, count);
			}
		}
		
		int M = Integer.parseInt(bf.readLine());
		ArrayList<String> arr = new ArrayList<>();
		st = new StringTokenizer(bf.readLine());
		
		for (int i = 0; i < M; i++) {
			arr.add(st.nextToken());
		}
		
		// 반복문을 돌며 arr에 저장된 수가 HashMap에 저장되어 있는지 확인
		for (String key : arr) {
			if (map.containsKey(key)) {	// 저장되어 있다면 key의 value 값 출력
				sb.append(map.get(key)).append(" ");
			}
			else {	// 없다면 0 출력
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
	}
}
