import java.io.*;
import java.util.*;

public class num_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N, M;
		HashMap<String, Integer> map = new HashMap<>();
		
		N = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		
		for (int i = 0; i < N; i++) {
			/*
			 * (key, value), 각 숫자의 존재 여부를 key로 찾을 것이기에, value 값은 불필요
			 * 만약 key 값이 중복되는 데이터가 추가되면, 기존의 해당 key의 value 값 갱신 
			 */
			map.put(st.nextToken(), 0);
		}
		
		M = Integer.parseInt(bf.readLine());
		// StringTokenizer는 입력을 한 줄 단위로 처리하기 때문에, 다른 줄의 입력을 처리할 때는 새로운 객체 생성 필요
		st = new StringTokenizer(bf.readLine());
		
		// key 값을 이용해 해당 key 값을 가진 entry가 HashMap에 있으면 value 값 return
		for (int i = 0; i < M; i++) {
			if (map.get(st.nextToken()) != null) {
				sb.append("1 ");
			}
			else {
				sb.append("0 ");
			}
		}
		
		System.out.println(sb);
	}
}