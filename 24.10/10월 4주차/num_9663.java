import java.io.*;
import java.util.*;

public class num_9663 {
	public static int N;	// 체스판 크기
	public static int count = 0;	// 경우의 수
	public static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[0] = i;
			n_queen(1);
		}
		
		System.out.println(count);
	}
	
	public static void n_queen(int col) {
		if (col == N) {	// 행을 다 채우면 경우의 수 1 증가 후 리턴
			count++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			boolean check = true;
			
			for (int j = 0; j < col; j++) {
				arr[col] = i;
				
				/*
				 * 같은 줄에 위치(arr[j] == arr[col])하고 있거나,
				 * 대각선에 위치(Math.abs(j - col) == Math.abs(arr[j] - arr[col]))하는지 확인
				*/
				if (arr[j] == arr[col] || Math.abs(j - col) == Math.abs(arr[j] - arr[col]) ) {
					check = false;
					break;
				}
			}
			
			if (check) {
				n_queen(col + 1);
			}
		}
	}
}
