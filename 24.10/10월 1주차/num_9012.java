import java.io.*;
import java.util.*;

public class num_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(bf.readLine());
		
		for (int i = 0; i < t; i++) {
			Stack<Character> stack = new Stack<>();
			String s = bf.readLine();
			
			// "(", ")"를 한 set로 생각하고, ")"이 입력됐을 때 stack이 비어있지 않다면 pop
			if (s.charAt(0) == ")".charAt(0)) {
				sb.append("NO").append('\n');
			}
			else {
				loopOut:	// 탈출반복문 지정
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == "(".charAt(0)) {
						stack.push(s.charAt(j));
					}
					else {
						if (!stack.empty()) {
							stack.pop();
						}
						else {	// stack이 비어있는 상태에서 ")"만 입력된 것이므로 VPS가 아니라 판단
							stack.push(s.charAt(j));
							break loopOut;
						}
					}
				}
			
				if (stack.empty()) {
					sb.append("YES").append('\n');
				}
				else {
					sb.append("NO").append('\n');
				}
			}
		}
		
		System.out.println(sb);
	}
}