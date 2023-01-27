package Baekjoon;

import java.util.Scanner;

public class Baekjoon2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int f1 = 0, f2 = 1, f3 = 1;

        for(int i=2;i<=num;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }

    public static int fiboCalculator(int n){
        if(n == 0)
            return 0;
        else if(n==1)
            return 1;
        else{
            return fiboCalculator(n-1) + fiboCalculator(n-2);
        }
    }
}
