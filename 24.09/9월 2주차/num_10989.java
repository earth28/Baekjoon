// Ctrl + Shift + O 단축키
import java.io.*;
import java.util.*;

public class num_10989 {
	public static void main(String[] args) throws IOException {
		/* BufferedReader : 
		 * - 일정 크기의 데이터를 한 번에 읽어 Buffer에 보관 후, 요청이 있을 때 버퍼에서 데이터를 읽어오는 방식
		 * - Scanner에 비해 속도 향상 및 시간 부하가 적음
		 * - 입력받은 데이터 타입이 String이므로 다른 데이터 타입으로 사용 시 형변환 필요
		 * - 예외처리 필요
		 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());	// int 타입으로 형변환
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int val : arr) {
			sb.append(val).append('\n');
		}
		
		System.out.println(sb);
	}
}