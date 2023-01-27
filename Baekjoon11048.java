package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Baekjoon11048 {
    static int n,m;
    static int arr[][];

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        setArraySize();
        setArr();
        input();
        System.out.println(maximumValue());

    }
    static void setArraySize(){
        n = sc.nextInt();
        m = sc.nextInt();
    }

    static void setArr(){
        arr = new int[n+1][m+1];
    }

    static void input(){
        for(int i=1;i<n+1;i++)
            for(int j=1;j<m+1;j++){
                arr[i][j] = sc.nextInt();
            }
    }

   static int maximumValue(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j] += max(arr[i - 1][j], max(arr[i - 1][j - 1], arr[i][j - 1]));
            }
        }
       return arr[n][m];
   }
    static void showArr(){
        for(int i=0;i<=n+1;i++){
            for(int j=0;j<=m+1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
