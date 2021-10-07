import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class YoungJung2231 {
	// 생성자 찾는 메소드 
	public static int searshConstructor (int N) {
		int result;
		
		for (int i = 1; i < N; i++) {
			result  = 0;
			String BR[] = Integer.toString(i).split("");
			result += i;
			for (int j = 0; j < BR.length; j++) {
				result += Integer.parseInt(BR[j]);
			}
			
			if (result == N) {
				return i;
			}
			
		}
		return 0;
		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException  {
		// N의 분해합 구하기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(searshConstructor(N));
		
	}
	
}
