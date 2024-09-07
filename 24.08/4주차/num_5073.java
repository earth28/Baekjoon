import java.util.*;

public class num_5073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];	// 삼각형 세 변의 길이 저장
		
		while (true) {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			// 0 0 0 입력되면 무한루프 종료
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			
			// 배열 정렬 메소드, 오름차순 정렬
			Arrays.sort(arr);
			
			if (arr[0] + arr[1] > arr[2]) {	// 삼각형의 조건
				if (arr[0] == arr[1] && arr[1] == arr[2]) {
					System.out.println("Equilateral");
				}
				else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}
	}
}
