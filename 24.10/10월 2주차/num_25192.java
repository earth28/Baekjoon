import java.util.*;
import java.io.*;

public class num_25192 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<String> set = new HashSet<>();	// 채팅한 유저를 추적할 set
		int N = Integer.parseInt(bf.readLine());
		int count = 0;	// 곰곰티콘 사용 횟수
		
		while (N-- > 0) {
			String s = bf.readLine();
			
			// 새로운 사람이 입장한 경우
			if (s.equals("ENTER")) {	// 문자열 내용을 비교할 때는 equals() 메소드 이용
				set.clear();	// set 초기화
				continue;
			}
			
			// 처음 채팅한 사람이라면 곰곰티콘 사용으로 간주
			if (!set.contains(s)) {
				set.add(s);
				count++;
			}
		}
		
		System.out.println(count);
	}
}