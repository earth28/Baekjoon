import java.util.Scanner;

public class num_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];	// 알파벳 배열
		String S = sc.next().toUpperCase();
		
		for (int i = 0; i < S.length(); i++) {
			arr[S.charAt(i) - 65]++;	// 알파벳을 배열 인덱스로 전환
		}
		
		int max = 0;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			}
			
			else if (arr[i] == max) {	// 가장 많이 사용된 알파베이 여러 개 일 경우
				ch = '?';
			}
		}
		
		System.out.print(ch);
	}
}
