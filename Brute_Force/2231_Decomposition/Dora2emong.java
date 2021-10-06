import java.util.Scanner;
public class Dora2emong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0, c;
		
		for(int i = 0; i<n; i++) {
			res = i+1;
			c = i+1;
			while(c != 0) {
				res += c % 10;
				c /= 10;
			}
			if(res == n) {
				res = i+1;
				break;
			}
			else
				res = 0;
		}
		System.out.println(res);
		
		sc.close();
	}

}