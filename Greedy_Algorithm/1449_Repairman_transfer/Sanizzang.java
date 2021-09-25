import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Sanizzang {
    static int N;
    static int L;
    static int[] hole;
    static int cnt = 0;
    static int position;
    static int tape = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        hole = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            hole[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(hole);

        for (int i = 0; i < N; i++) {
            position = hole[i];
            if (position > tape) {
                tape = position + L - 1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
