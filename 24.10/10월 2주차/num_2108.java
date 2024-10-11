import java.io.*;
import java.util.*;

public class num_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		sb.append(average(arr, N)).append('\n');
		sb.append(median(arr, N)).append('\n');
		sb.append(mode(arr)).append('\n');
		sb.append(range(arr)).append('\n');
		
		System.out.println(sb);
	}
	
	public static int average(int[] arr, int n) {
		double  sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		// int형은 나눗셈 과정에서 소수점이 버려지기 때문에 반올림을 위해 Math.round를 쓰기 전에 sum이나 n 중 하나를 double로 캐스팅
		int ave = (int) Math.round(sum / n);
		
		return ave;
	}
	
	public static int median(int[] arr, int n) {
		Arrays.sort(arr);
		int mid = (n - 1) / 2;
		
		return arr[mid];
	}
	
	public static int mode(int[] arr) {
		// 빈도를 저장할 HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 빈도 계산
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // 최빈값을 저장할 리스트
        List<Integer> modeList = new ArrayList<>();
        int maxFrequency = 0;
        
        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modeList.clear(); // 더 높은 빈도가 나오면 리스트 초기화
                modeList.add(value);
            } else if (frequency == maxFrequency) {
                modeList.add(value); // 동일한 빈도라면 리스트에 추가
            }
        }
        
        // 최빈값 리스트 정렬
        Collections.sort(modeList);
        
        // 최빈값이 여러 개일 경우 두 번째로 작은 값 반환
        if (modeList.size() > 1) {
            return modeList.get(1); // 두 번째로 작은 최빈값 반환
        } else {
            return modeList.get(0); // 최빈값이 하나라면 그 값 반환
        }
	}
	
	public static int range(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if (num < min) min = num;
			if (num > max) max = num;
		}
		
		return max - min;
	}
}