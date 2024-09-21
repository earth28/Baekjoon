import java.util.*;

public class num_7785 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<String, String> map = new HashMap<>(); 
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String state = sc.next();
			
			if (map.containsKey(name)) {	// 최초 입력이 아니면 leave
				map.remove(name);
			}
			else {	// 최초 입력이 enter
				map.put(name, state);
			}
		}
		
		// HashMap의 Key들을 ArrayList로 변경
		ArrayList<String> keySet = new ArrayList<String>(map.keySet());
		
		/* 틀린 이유
		 * Collections.reverse() : 이미 정렬된 리스트의 순서를 그대로 뒤집는다.
		 * 리스트가 특정한 순서로 정렬되어 있지 않으면 현재 상태에서 순서를 반대로 바꾸는 것.
		 * 만약 리스트가 오름차순으로 이미 정렬되어 있다면 이를 내림차순으로 뒤집을 수 있으나,
		 * 그렇지 않으면 단순히 입력 순서만 반대로 뒤집음
		 * reverseOrder()를 사용해야 내림차순으로 정확하게 정렬
		 */
		
		Collections.sort(keySet, Collections.reverseOrder());
		
		for (String key : keySet) {
			System.out.println(key + " ");
		}
	}
}