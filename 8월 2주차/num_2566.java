import java.util.Scanner;

public class num_2566 {
	public static void main(String[] args) {
		int [][] arr = new int[9][9];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int col = 1, row = 1;	// 1로 선언해야 배열의 위치를 1부터 출력 가능
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					col = i + 1;
					row = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(col + " " + row);
	}
}