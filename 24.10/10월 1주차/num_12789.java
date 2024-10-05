import java.io.*;
import java.util.*;

public class num_12789 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int index = 1;	// 간식줄 번호표
		String result = "Nice";	// 기본 값은 Nice
		
		String[] arr = bf.readLine().split(" ");
		Stack<Integer> stack = new Stack<>();
		
		// 현재 줄 + 대기 줄 처리
		for (int i = 0; i < n; i++) {
			int current = Integer.parseInt(arr[i]);
			
			if (index != current) {
				if (!stack.empty() && index == stack.peek()) {
					index++;
					i--;
					stack.pop();
				}
				else {
					stack.push(current);
				}
			}
			else {
				index++;
			}
		}
		
		// 대기 줄 처리
		while (!stack.empty()) {
			int pop = stack.pop();
			
			if (pop == index) {
				index++;
			}
			else {
				result = "Sad";
				break;
			}
		}
		
		System.out.println(result);
	}
}
