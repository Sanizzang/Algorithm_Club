import java.io.*;

public class Sanizzang {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String digit_n = br.readLine();
        int digit_len = digit_n.length();

        int N = Integer.parseInt(digit_n);
        int M = 0;

        for (int i = (N - (digit_len * 9)); i < N; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == N) {
                M = i;
                break;
            }
        }

        System.out.println(M);
    }
}
