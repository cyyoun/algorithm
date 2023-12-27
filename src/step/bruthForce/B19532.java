package step.bruthForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 수학은 비대면강의입니다
 * level: B2
 * memory(KB): 16024
 * time(ms): 148
 * size(B): 804
 */
public class B19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        x = (bf - ec) / (bd - ea)
        y = (cd - af) / (bd - ea)
        */
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = (b*f - e*c) / (b*d - e*a);
        int y = (c*d - a*f) / (b*d - e*a);
        System.out.println(x + " " + y);


    }
}

