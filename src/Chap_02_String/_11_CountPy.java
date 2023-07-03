package Chap_02_String;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _11_CountPy {

   static boolean isTrue (String str){

       //모든 문자 소문자로 바꾸기
       String lowercase = str.toLowerCase();
       //System.out.println(lowercase);
       //System.out.println("소문자 변환 : " + lowercase);

       //원본길이 저장
       int length = lowercase.length();
       //System.out.println("원본 길이 : " + length);

       //p의 길이 저장
       String changeP = lowercase.replace("p","");
       int P_length = length - changeP.length();
       //System.out.println("p 바꾼 문자 : " + changeP);
       //System.out.println("p 갯수 : " + P_length);

       //y길이 저장
       String changeY = lowercase.replace("y","");
       int Y_length = length - changeY.length();
       //System.out.println("y 바꾼 문자 : " + changeY);
       //System.out.println("y 갯수 : " + Y_length);

       //같은지 비교
       boolean equal;

       if (P_length == Y_length){
           equal = true;
       } else {equal = false;}

       return equal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _11_CountPy solution = new _11_CountPy();
        boolean TF = solution.isTrue(str);
        System.out.println(TF);

    }


}




/*
#프로그래머스  코드#
import java.util.Scanner;
class Solution {
    boolean solution(String s) {

        String lowercase = s.toLowerCase();
        //System.out.println(lowercase);
        //System.out.println("소문자 변환 : " + lowercase);

        //원본길이 저장
        int length = lowercase.length();
        //System.out.println("원본 길이 : " + length);

        //p의 길이 저장
        String changeP = lowercase.replace("p","");
        int P_length = length - changeP.length();
        //System.out.println("p 바꾼 문자 : " + changeP);
        //System.out.println("p 갯수 : " + P_length);

        //y길이 저장
        String changeY = lowercase.replace("y","");
        int Y_length = length - changeY.length();
        //System.out.println("y 바꾼 문자 : " + changeY);
        //System.out.println("y 갯수 : " + Y_length);

        //같은지 비교
        boolean equal;

        if (P_length == Y_length){
            equal = true;
        } else {equal = false;}

        return equal;


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Solution solution = new Solution();
        boolean TF = solution.solution(str);
        System.out.println(TF);

    }



}*/
