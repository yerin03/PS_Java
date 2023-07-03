package Chap_02_String;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class _11_CountPy {

   static boolean isTrue (String str){

       //모든 문자 소문자로 바꾸기
       String lowercase = str.toLowerCase();
       //System.out.println(lowercase);

       //원본길이 저장
       int length = lowercase.length();

       //p의 길이 저장
       String changeP = lowercase.replace("p","");
       int P_length = length - changeP.length();

       //y길이 저장
       String changeY = lowercase.replace("y","");
       int Y_length = length - changeP.length();

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
