package step.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * title: 세탁소 사장 동혁
 * level: 브론즈 3
 * memory(KB): 14256
 * time(ms): 124
 * size(B): 873
 */
public class BJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] arrMoney = {25, 10, 5, 1};
            for (int j = 0; j < 4; j++) {
                int money = arrMoney[j];
                if (m / money > 0) {
                    sb.append(m / money).append(" ");
                    m %= money;
                } else {
                    sb.append("0 ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
