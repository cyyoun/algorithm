package step.bruthForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * title: 분해합
 * level: B2
 * memory(KB): 14244
 * time(ms): 128
 * size(B): 754
 */
public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int length = s.length();
        int n = Integer.parseInt(s);
        int result = 0;

        for (int i = n - (length * 9); i < n; i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (i + sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
