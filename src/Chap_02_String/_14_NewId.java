package Chap_02_String;

import java.util.Scanner;

public class _14_NewId {

    public String remove(String str){

        str = str.replaceAll("^\\.|\\.$","");
        // ^\\.는 문자열의 시작부분에 위치한 마침표 \\.$는 문자열 끝에 위차한 마침표
        return str;
    }

    public String makeId(String str){

        //1단계
        str = str.toLowerCase();

        //2단계
        str = str.replaceAll("[^a-z0-9\\-_.]","");
        //^를 사용하여 대괄호 안에 포함된 문자를 제외한 모든 문자를 나타낸다.


        //3단계
        str = str.replaceAll("\\.{2,}",".");
        //정규표현식 \\.{2,}는 연속된 마침표(.)가 2번 이상 나타나는 패턴을 나타낸다.


        //4단계
        str = remove(str);


        //5단계
        if(str.length() == 0){str = "a";}


        //6단계
        if(str.length() >= 16){

            str = str.substring(0,15);
            str = remove(str);

        }

        //7단계
        //길이가 3 될때까지 마지막꺼 더하기
        while(str.length()<=2){
            str += str.charAt(str.length()-1);

        }


        return str;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        _14_NewId solution = new _14_NewId();
        System.out.println(solution.makeId(str));

    }




}


/*

프로그래머스

import java.util.Scanner;
class Solution {

    public String remove(String str){

        str = str.replaceAll("^\\.|\\.$","");
        // ^\\.는 문자열의 시작부분에 위치한 마침표 \\.$는 문자열 끝에 위차한 마침표
        return str;
    }

    public String solution(String str) {
        //1단계
        str = str.toLowerCase();

        //2단계
        str = str.replaceAll("[^a-z0-9\\-_.]","");
        //^를 사용하여 대괄호 안에 포함된 문자를 제외한 모든 문자를 나타낸다.


        //3단계
        str = str.replaceAll("\\.{2,}",".");
        //정규표현식 \\.{2,}는 연속된 마침표(.)가 2번 이상 나타나는 패턴을 나타낸다.


        //4단계
        str = remove(str);


        //5단계
        if(str.length() == 0){str = "a";}


        //6단계
        if(str.length() >= 16){

            str = str.substring(0,15);
            str = remove(str);

        }

        //7단계
        //길이가 3 될때까지 마지막꺼 더하기
        while(str.length()<=2){
            str += str.charAt(str.length()-1);

        }


        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        Solution solution = new Solution();
        System.out.println(solution.solution(str));

    }




}*/
