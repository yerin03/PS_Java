package Chap_10_DP;

import java.util.Arrays;
import java.util.Scanner;

public class _38_Fibo {


    private static final int[] mem = new int[100001];
    private int fibonacci(int n){
        if (mem[n] != -1 ) return mem[n];
        if(n == 0 || n==1 ) return n;

        return mem[n] = (fibonacci(n-1) + fibonacci(n-2)) % 1234567;
    }

    public int solution(int n){ //메모제이션
        Arrays.fill(mem,-1);

        for (int i=0 ; i<= n; i++){
            fibonacci(n);
        }
        return fibonacci(n);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        _38_Fibo fibo = new _38_Fibo();
        int result = fibo.solution(n);
        System.out.println(result);


    }

}
