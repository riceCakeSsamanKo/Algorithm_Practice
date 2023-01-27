package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2294 {
    static Scanner sc = new Scanner(System.in);
    static final int NMAX = 101;
    static final int KMAX = 10000;

    public static void main(String[] args) {
        int n = sc.nextInt();  // 동전 종류 개수
        int k = sc.nextInt(); // 동전으로 만들 총 가치의 합

        int coin[] = new int[NMAX];  //각 동전의 값들. 오름차순으로 정렬해줄 것.
        int dp[] = new int[KMAX+1];

        for(int i=0;i<n;i++){
            coin[i] = sc.nextInt();
        }
        Arrays.fill(dp,1,k+1,KMAX+1);
        dp[0] = 0;

        for(int i=0;i<n;i++){
            for(int j=coin[i];j<=k;j++){
                dp[j] = Math.min(dp[j],dp[j-coin[i]]+1);
            }
        }

        if(dp[k] == KMAX+1)
            System.out.print(-1);
        else
            System.out.println(dp[k]);

    }
}


