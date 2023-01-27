package Baekjoon;

import java.util.Scanner;

public class Baekjoon9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();


        while(tc-- != 0){
            int n= sc.nextInt();
            long[] dp =new long[100];

            dp[0] = dp[1] = dp[2] = 1l;
            dp[3] = dp[4] = 2l;

            for(int i=5;i<n;i++){
                dp[i] = dp[i-2]+dp[i-3];
            }

            System.out.print(dp[n-1]);
        }

    }
}
