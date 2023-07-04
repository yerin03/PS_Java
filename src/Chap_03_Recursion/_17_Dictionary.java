package Chap_03_Recursion;

import java.util.Scanner;

public class _17_Dictionary {

    private static final char[] vowels = {'A','E','I','O','U'};
    private static int answer;


    public int solution(String word){

        answer = 0;
        calculateOrder(word,"",0); //(순서 찾을 단어,빈 문자열부터 시작,몇번쨰인지)
        return answer;
    }

    private void calculateOrder(String word,String currentWord,int depth){

        //하나씩 늘리다가 목표값에 도달하면 정지
        if(currentWord.equals(word)){ return ;} // 함수 종료

        if(currentWord.length()>0){answer ++;} //유효한 단어인지 확인

        if (currentWord.length() >= 5) { return; } //길이는 5를 초과 할 수 없음을 확인


        //
        for (int i=0; i<vowels.length; i++){

            calculateOrder(word,currentWord+vowels[i],depth+1);
        }

    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        _17_Dictionary solution = new _17_Dictionary();

        System.out.println(solution.solution(word));


    }



}
