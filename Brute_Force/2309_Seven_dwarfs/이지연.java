import java.util.Arrays;
import java.util.Scanner;

class JiYeon {

	public static void main(String[] args) {
		
		// 9명의 난쟁이 중 2명의 난쟁이의 키를 빼서 100이 나오면 된다.
		Scanner scan = new Scanner(System.in);
		int heights[] = new int[9];
		int sum=0;
		int x1=0, x2=0;
		
		// heights 배열에 난쟁이 키 저장
		for(int i=0; i<9; i++) {
			heights[i] = scan.nextInt();
			sum = sum + heights[i];       // 9명 난쟁이 키의 합
		}
		Arrays.sort(heights); // 오름차순으로 정렬
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int m = heights[i]+heights[j]; // 2명의 난쟁이 키의 합
				// 9명 난쟁이 키 합에서 100을 빼면 2명의 난쟁이 키 합
				// i,j의 값이 같을 순 없다.
				if(m == (sum-100) && (i!=j)) { 
					x1 = i;
					x2 = j;
					break;
				}
			}
		}
		// 합이 100인 7명의 난쟁이 키 출력
		for(int i=0; i<9; i++) {
			if(i==x1 || i==x2) continue; // 포함되지 않는 2명의 난쟁이 키 제외
			System.out.println(heights[i]);
		}
		scan.close();
		
	}

}