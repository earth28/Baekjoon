import java.util.*;

public class num_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int I = sc.nextInt();
		char[] arr = new char[S.length()];
		
		// 문자열을 문자 하나씩 배열에 저장
		for (int i = 0; i < S.length(); i++) {
			arr[i] = S.charAt(i);
		}
		
		System.out.println(arr[I - 1]);
	}
}