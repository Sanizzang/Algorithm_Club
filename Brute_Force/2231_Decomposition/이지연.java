import java.util.Scanner;

class JiYeon{

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		
		int N = scan.nextInt(); 
		int M = 0; 
		
		
		for(int i=1; i<N; i++) {
			int num = i;
			int sum = 0; 
			
			
			while(num != 0) {  
				sum += num%10;
				num = num/10;
			}
			
			
			if(sum + i == N) { 
				M = i;
				break;         
			}
		}
		System.out.println(M);
		scan.close();
	}

}

