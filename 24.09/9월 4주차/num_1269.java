import java.io.*;
import java.util.*;

public class num_1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> A = new HashSet<Integer>(); 
		HashSet<Integer> B = new HashSet<Integer>();
		//HashSet<Integer> temp = new HashSet<Integer>();
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			A.add(value);
			//temp.add(value);
		}
		
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < m; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
		
		/* 임의의 HashSet을 하나 더 생성하여 java 내의 차집합, 합집합 메소드를 활용했었음
		A.removeAll(B);
		B.removeAll(temp);
		
		A.addAll(B);
		
		sb.append(A.size());
		*/
		
		/*
		 *  Hash의 짧은 검색 시간 활용 : set.contain() => O(1)
		 *  실제로 위의 방법보다 메모리, 시간이 훨씬 적게 소요됨
		 */
		
		int count = 0;
		for (int num : A) {
			if (!B.contains(num)) {
				count++;
			}
		}
		
		for (int num : B) {
			if (!A.contains(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}