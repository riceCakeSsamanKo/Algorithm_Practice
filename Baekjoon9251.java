package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon9251 {
    static String s1;
    static String s2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s1 = sc.nextLine();
        s2 = sc.nextLine();

        int dp[][] = new int[1001][1001];
        for(int i=0;i<=1000;i++){
            Arrays.fill(dp[i],0);
        }

        final int s1Len = s1.length();
        final int s2Len = s2.length();

        for(int i=1;i<=s1Len;i++){
            for(int j=1;j<=s2Len;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.print(dp[s1Len][s2Len]);
    }
}
