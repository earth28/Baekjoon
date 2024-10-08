import java.io.*;
import java.util.*;

public class num_24511 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[] arr = new int[N];
		Deque<Integer> deque = new ArrayDeque<>();
		
		st = new StringTokenizer(bf.readLine());
		
		// 0이면 큐, 1이면 스택
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine());
		
		// arr[i]의 자료구조에 들어 있는 원소
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (arr[i] == 0) deque.addLast(num);	// 스택은 관여하지 않으므로 큐인 경우만 생각
		}
		
		int M = Integer.parseInt(bf.readLine());
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < M; i++) {
			deque.addFirst(Integer.parseInt(st.nextToken()));
			sb.append(deque.pollLast()).append(" ");
		}
		
		System.out.println(sb);
	}
}
