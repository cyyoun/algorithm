package step.bruthForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 블랙잭
 * level: B2
 * memory(KB): 14052
 * time(ms): 132
 * size(B): 1267
 */
public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(search(n, A, m));
    }

    private static int search(int n, int[] A, int m) {
        int result = 0, sum;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = A[i] + A[j] + A[k];
                    if (sum == m) {
                        return sum;
                    }
                    if (sum < m && sum > result) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
