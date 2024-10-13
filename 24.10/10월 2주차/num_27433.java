import java.io.*;

public class num_27433 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fact(N));
	}
	
	static long fact(int N) {	// 자료형을 int로 선언했어서 틀림, 20!은 int 범위를 초과하기 때문
		if (N <= 0) return 1;
		
		return N * fact(N - 1);
	}
}