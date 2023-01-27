package Baekjoon;

import java.util.Scanner;

public class Baekjoon2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long f1=0,f2=1,f3=1;
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        System.out.println(f3);
    }
}
