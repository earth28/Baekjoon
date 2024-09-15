import java.io.*;
import java.util.*;

public class num_1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = bf.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {	// 배열이 아닌 단어 비교이기에 String[] 대신 String
			@Override
			public int compare(String s1, String s2) {	// 양수면 위치 변환
				if (s1.length() == s2.length()) {	// 문자열 길이 같을 경우 사전 순
					/*
					 * compareTo : 두 개의 값을 비교하여 int 값으로 반환
					 * 숫자 비교 - 크다(1), 같다(0), 작다(-1)
					 * 문자열 비교
					 * - 같다(0)
					 * - 기준값에 비교 대상이 포함되어 있는 경우, 서로의 문자열 길이 차이값을 리턴
					 *   ※ compareTo는 같은 위치의 문자만 비교하기에, 첫번째 문자부터 순서대로 비교해 다를 경우 아스카값 기준으로 비교
					 * - 비교 불가능한 지점의 각 문자열 아스키값 기준으로 비교
					 */
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();	// 길이 순
				}
			}
		});
		
		sb.append(arr[0]).append('\n');
		
		// 중복되지 앟는 단어만 출력
		for (int i = 1; i < N; i++) {
			if (!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		
		System.out.println(sb);
	}
}
