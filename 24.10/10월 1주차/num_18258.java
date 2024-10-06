import java.io.*;
import java.util.*;

public class num_18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer command;
		
		int n = Integer.parseInt(bf.readLine());
		Deque<Integer> queue = new LinkedList<>();
		
		while (n-- > 0) {	// 증감연산자와 꺾쇠괄호
			command = new StringTokenizer(bf.readLine(), " ");
			Integer num;
			
			switch (command.nextToken()) {
				case "push" :	// queue의 맨 뒤에 요소 추가
					queue.offer(Integer.parseInt(command.nextToken()));
					break;
					
				case "pop" :	// 가장 앞에 있는 요소 삭제, 없을 경우 null 반환
					num = queue.poll();
					if (num == null) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(num).append('\n');
					}
					break;
					
				case "size" :
					sb.append(queue.size()).append('\n');
					break;
					
				case "empty" :
					if (queue.isEmpty()) {
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
					
				case "front" :	// 가장 앞에 있는 요소 반환, 없다면 null 반환
					num = queue.peek();
					if (num == null) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(num).append('\n');
					}
					break;
					
				case "back" :	// 맨 뒤에 있는 요소 반환, 없다면 null 반환
					num = queue.peekLast();
					if (num == null) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(num).append('\n');
					}
					break;
			}
		}
		
		System.out.println(sb);
	}
}