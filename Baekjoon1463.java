package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//x가 3으로 나누어 떨어지면 3으로 나눈다
//x가 2로 나누어 떨어지면 2로 나눈다
//1을 뺀다
public class Baekjoon1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        dp[1] = 0;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1]+1;

            if(i%3 == 0){
                dp[i] = Math.min(dp[i/3]+1, dp[i]);
            }
            if(i%2 == 0){
                dp[i] = Math.min(dp[i/2]+1, dp[i]);
            }
        }
        System.out.print(dp[n]);
    }

}
