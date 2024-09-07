import java.util.*;

public class num_10798 {
	public static void main(String[] args) {
		char [][] arr = new char[5][15];	// 배열 선언
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			String str = sc.nextLine();	// Enter 입력 전까지 쓴 문자열 모두 리턴
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		// 세로 출력
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == '\0') {	// char 배열 초기값은 \0, NULL이면 넘어감
					continue;
				}
				System.out.print(arr[j][i]);
			}
		}
	}
}
