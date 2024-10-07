import java.io.*;
import java.util.*;

public class num_2346 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(bf.readLine());
		Deque<Ballon> deque = new ArrayDeque<>();
		
		st = new StringTokenizer(bf.readLine(), " ");
		
		// n의 풍선을 deque에 저장, 이때 풍선 번호와 숫자 값 같이 저장
		for (int i = 1; i <= n; i++) {
			deque.add(new Ballon(i, Integer.parseInt(st.nextToken())));
		}
		
		// 풍선이 남아있는 동안 루프 실행
		while (!deque.isEmpty()) {
			sb.append(deque.getFirst().index + " ");	// 첫 번째 풍선 터뜨리고 그 번호 결과에 추가
			int next = deque.poll().val;	// 터진 풍선의 숫자 값 가져옴
			
			// 풍선이 더 이상 없으면 루프 종료
			if (deque.isEmpty()) break;
			
			// 풍선의 숫자 값에 따라 이동
			if (next > 0) {	// 양수라면 오른쪽으로 next-1만큼 이동
				for (int i = 0; i < next - 1; i++) {
					deque.addLast(deque.pollFirst());
				}
			}
			else {	// 음수라면 왼쪽으로 절대값만큼 이동
				for (int i = 0; i < Math.abs(next); i++) {
					deque.addFirst(deque.pollLast());
				}
			}
		}
		
		System.out.println(sb);
	}
}

class Ballon {	// 풍선의 인덱스와 숫자 값을 저장하는 클래스
	int index;
	int val;
	
	public Ballon(int index, int val) {
		this.index = index;
		this.val = val;
	}
}
