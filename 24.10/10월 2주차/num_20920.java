import java.io.*;
import java.util.*;

public class num_20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 길이가 M 이상인 단어와 그 개수 저장
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (s.length() < M) continue;
			
			// 이미 나온 단어인 경우 개수 증가, 처음 나온 단어인 경우 1로 설정
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		// map에서 단어들을 가져와 저장
		List<String> words = new ArrayList<>(map.keySet());
		
		// words 정렬
		Collections.sort(words, new Comparator<String>() {
			public int compare(String o1, String o2) {
				// 자주 등장하는 단어 순서대로 정렬
				if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
					return Integer.compare(map.get(o2), map.get(o1));
				}
				
				// 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
				if (o1.length() != o2.length()) {
					return o2.length() - o1.length();
				}
				
				// 등장 횟수와 길이가 같으면 사전순 정렬
				return o1.compareTo(o2);
			}
		});
		
		for (String s : words) {
			sb.append(s).append('\n');
		}
		
		System.out.println(sb);
	}
}
