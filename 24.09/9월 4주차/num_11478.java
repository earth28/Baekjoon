import java.io.*;
import java.util.*;

public class num_11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String S = bf.readLine();
		HashSet<String> set = new HashSet<>();
		
		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1 ; j <= S.length(); j++) {
				// substring() : 문자열의 특정 부분을 잘라낼 때 사용
				set.add(S.substring(i,j));
			}
		}
		
		System.out.println(set.size());
	}
}