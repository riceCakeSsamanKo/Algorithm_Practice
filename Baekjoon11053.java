package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[1000];
        int dp[] = new int[1000];
        Arrays.fill(dp,0);
        dp[0] = 1;

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int ans = 1;

        for (int i = 1; i < N; i++) {
            int MAX = 1;

            for (int j = 0; j < i; j++)
                if (arr[j] < arr[i] ) {
                    MAX = Math.max(dp[j]+1,MAX);  //MAX = arr[i]보다 작은 arr[j]들중 가장 큰 dp[j] 값
                }
            dp[i] = MAX;

            ans = Math.max(dp[i],ans);
        }

        System.out.print(ans);
    }
}
