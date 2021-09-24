import java.util.*;

public class Sanizzang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dwarfs = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			dwarfs[i] = sc.nextInt();
			sum += dwarfs[i];
		}
		Arrays.sort(dwarfs);
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - dwarfs[i] - dwarfs[j] == 100) {
					for (int k = 0; k < 9; k++) {
						if (i == k || j == k) {
							continue;
						}
						System.out.println(dwarfs[k]);
					}
					System.exit(0);
				}
			}
		}
	}
}
