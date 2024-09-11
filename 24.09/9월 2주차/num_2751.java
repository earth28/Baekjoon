import java.util.*;

public class num_2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// StringBuilder : String과 문자열을 더할 때 새로운 객체를 생성하지 않고 기존의 데이터에 더하는 방식
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		// Collections.sort() : 리스트를 중복 제거 후 오름차순으로 정렬
		Collections.sort(list);
		
		for (int val : list) {
			sb.append(val).append('\n');
		}
		
		System.out.println(sb);
	}
}