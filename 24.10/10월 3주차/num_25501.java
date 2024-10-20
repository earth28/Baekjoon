import java.util.*;
import java.io.*;

public class num_25501{
	public static int count;	// static 변수로 선언하여 모든 호출에서 공유되도록
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
        	String s = br.readLine();
        	count = 0;
        	
        	int result = isPalindrome(s);
        	sb.append(result + " " + count).append('\n');
        }
        
        System.out.println(sb);
    }
	
    public static int recursion(String s, int l, int r){
    	count++;	// recursion 함수 호출될 때마다 count 증가
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}