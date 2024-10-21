import java.util.*;
import java.io.*;

public class num_11729 {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');	// 형변환
		
		Hanoi(N, 1, 2, 3);
		
		System.out.println(sb);
	}
	
	// N : 원판 갯수, start : 출발지, mid : 경유지, to : 도착지
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N == 1) {
			sb.append(start + " " + to).append('\n');
			return;
		}
		
		// N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 이동)
		Hanoi(N - 1, start, to, mid);
		
		// 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to 지점으로 이동)
		sb.append(start + " " + to).append('\n');
		
		// N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 이동)
		Hanoi(N - 1, mid, start, to);
	}
}
