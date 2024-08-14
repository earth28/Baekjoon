import java.util.*;

public class num_2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase();	// 대문자 변환
		int B = sc.nextInt();	// B진법
		
		int result = 0;	// 결과값
		int tmp = 1;	// 곱셈을 위한 변수
		
		// 입력받은 수의 끝자리부터 하나씩 수로 변환
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				result += (c - 55) * tmp;	// A의 아스키코드 값이 65이므로 A가 10이 되도록
			}
			else {
				result += (c -48) * tmp;	// 0의 아스키코드 값은 48
			}
			
			tmp *= B;	// 자릿수에 맞춰 승수 높아지도록
		}
		
		System.out.print(result);
	}
}