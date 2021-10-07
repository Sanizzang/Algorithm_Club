import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class YoungJung2309 {
	public static void Choice (int P[]) {
		boolean visite[] = new boolean[9];
		int sum = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				visite[i] = true;
				visite[j] = true;
				// false만 더함 
				for (int j1 = 0; j1 < 9; j1++) {
					if (visite[j1] == false) {
						sum += P[j1];
					}
				}
				if (sum == 100) {
					for (int j1 = 0; j1 < 9; j1++) {
						if (visite[j1] == false) System.out.println(P[j1]);
					}
					System.exit(0);
				}
				else {
					sum = 0;
					Arrays.fill(visite, false);
				}
				
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int height[] = new int [9];
		
		for (int i = 0; i < 9; i++) {
			height[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(height);
		Choice(height);
		
	}

}
