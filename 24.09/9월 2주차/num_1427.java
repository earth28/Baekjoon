import java.io.*;
import java.util.*;

public class num_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		// 각 자리 수 구하기
		while (N > 0) {
			arr.add(N % 10);
			N /= 10;
		}
		
		// 내림차순 정렬
		arr.sort(Comparator.reverseOrder());
		
		for (int val : arr) {
			sb.append(val);
		}
		
		System.out.println(sb);
	}
}