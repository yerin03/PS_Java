package Chap_02_String;

import java.util.Scanner;

public class _09_TernaryReverse {

    //3진법으로 바꾸고 변환하기
    public int ReversedTernary(int n){

        //3진법으로 바꾸기
        String ternary = Integer.toString(n,3);
        //System.out.println("3진법 : " + ternary);

        //문자열 뒤집기
        String temp = new StringBuilder(ternary).reverse().toString();
        //System.out.println("뒤집기 : " + temp);

        //다시 10진수로 바꾸기
        int result = Integer.parseInt(temp,3);
        //System.out.println("정답 : " + result);
        return result;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("받은 값 : "+ n);

        _09_TernaryReverse answer = new _09_TernaryReverse();
        int result = answer.ReversedTernary(n);

        System.out.println(result);


    }
}



/*

#프로그래머스 코드#

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n,3);
        //System.out.println("3진법 : " + ternary);

        //문자열 뒤집기
        String temp = new StringBuilder(ternary).reverse().toString();
        //System.out.println("뒤집기 : " + temp);

        //다시 10진수로 바꾸기
        int result = Integer.parseInt(temp,3);
        //System.out.println("정답 : " + result);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println("받은 값 : "+ n);

        Solution answer = new Solution();
        int result = answer.solution(n);

        System.out.println(result);


    }




}
*/
