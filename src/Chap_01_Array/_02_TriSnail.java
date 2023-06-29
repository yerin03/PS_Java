package Chap_01_Array;

import java.util.Scanner;

public class _02_TriSnail {
    public static void main(String[] args) {

        //입력값 n 만들어서 nXn 0 배열 만들기
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of : ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i<n ; i++){
            for (int j=0; j<n; j++){
                array[i][j] = 0;
            }
        }

        for (int i = 0; i<n ; i++){
            for (int j=0; j<n; j++){
                System.out.print(array[i][j]);;
            }
            System.out.println();
        }






        //while 돌리기 -> 언제까지? 1+..n 될때 까지
        //모든 배열의 합 구하기






    }

}
