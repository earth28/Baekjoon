import java.io.*;
import java.util.*;

public class num_28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<>();	// java에서 지원하는 stack 클래스 사용
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			int command = Integer.parseInt(st.nextToken());	// 명령
			
			/*
			 * switch-case 조건문은 마지막에 break문 써야함
			 * stack.peek()은 단순히 맨 위의 숫자를 반환하는 것이므로 sb에 append해줘야 함.
			 * 그렇지 않으면 출력 x
			 */
			
			switch (command) {
				case 1 : 	// 정수 stack에 push
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case 2 : 
					if (!stack.empty()) {	// stack에 정수가 있다면 맨 위의 정수 빼고 출력
						sb.append(stack.peek()).append('\n');
						stack.pop();
					}
					else sb.append(-1).append('\n');
					
					break;
				case 3 : 	// stack에 들어있는 정수 개수 출력
					sb.append(stack.size()).append('\n');
					break;
				case 4 : 	// stack 숫자 포함 여부에 따라 출력 다름
					if (!stack.empty()) {
						sb.append(0).append('\n');
					}
					else sb.append(1).append('\n');
					
					break;
				case 5 :
					if (!stack.empty()) {	// stack에 정수가 있다면
						sb.append(stack.peek()).append('\n');
					}
					else sb.append(-1).append('\n');
					
					break;
			}
		}
		
		System.out.println(sb);
	}
}