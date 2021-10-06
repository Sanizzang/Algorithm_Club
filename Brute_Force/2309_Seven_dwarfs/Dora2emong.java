import java.util.Arrays;
import java.util.Scanner;
public class Dora2emong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		int[] in = new int[9];
		for(int i=0; i<9;i++) {
			in[i] = sc.nextInt();
			res += in[i];
		}
		Arrays.sort(in);
		for(int i = 0; i< 9; i++) {
			for(int j = 0; j<9;j++) {
				if(res - (in[i] + in[j]) == 100) {
					for(int k = 0; k< 9; k++) {
						if(k == i || k == j) 
							continue;
						System.out.println(in[k]);
					}
					System.exit(0);
				}
			}
		}
	}

}
