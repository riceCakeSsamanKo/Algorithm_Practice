package Baekjoon;

import java.util.Scanner;

public class Baekjoon1912 {
    static Scanner in = new Scanner(System.in);
    static int numOfIntegers;
    static int arr[];
    static int dp[];


    public static void main(String[] args) {
        initializing();

        showArr();
        showDp();

        System.out.println(findBiggestNum());
    }

    public static void initializing(){
        //make base
        insertNumOfIntegers();
        formArr();
        formDp();
        //base setting
        setArr();
        setDp();

    }

    //make base
    public static void insertNumOfIntegers(){
        numOfIntegers = in.nextInt();
    }
    public static void formArr() {
        arr = new int[numOfIntegers];
    }
    public static void formDp() {
        dp = new int[numOfIntegers];
    }
    //base setting
    public static void setArr(){
        for(int i=0;i<numOfIntegers;i++){
            arr[i] = in.nextInt();
        }
    }
    public static void setDp(){
        dp[0] = arr[0];

        for(int i=1;i<numOfIntegers;i++)
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
    }

    //showing
    public static void showArr(){
        int countFive=1;
        for(int i:arr){
            System.out.printf("%d ",i);
            if(countFive++%5 == 0)
                System.out.println();
        }
        System.out.println();
    }
    public static void showDp(){
        int countFive=1;
        for(int i:dp){
            System.out.printf("%d ",i);
            if(countFive++%5 == 0)
                System.out.println();
        }
        System.out.println();
    }

    //result
    public static int findBiggestNum(){
        int max = dp[0];
        for(int i=1;i<numOfIntegers;i++){
            if(max<dp[i])
                max = dp[i];
        }
        return max;
    }

}
