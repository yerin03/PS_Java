package Chap_02_String;

//문자열 입력받고
//단어로 나누고
//대 소문자 변환하고
//다시 이어 붙이기 ??

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _07_StarngeString {

    public String[] change (String arr[]){

        String[] new_array = arr;
        int len_1 = new_array.length;
        char current_char;

        String[] result = new String[len_1];//빈 배열 하나 만들어주고


        for (int i=0;i<len_1;i++ ){
            for(int j=0;j<new_array[i].length();j++){

                current_char = new_array[i].charAt(j);

                if(j%2==0){//이게 짝수라면 -> 대문자로

                    current_char = Character.toUpperCase(current_char);

                }



            }
        }


        return new_array;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = input.split(" "); //공백을 기준으로 단어 나누기
        System.out.println(Arrays.toString(words));

        System.out.println(words[1]);
        char firstChar = words[1].charAt(0);
        int len = words[1].length();
        System.out.println(firstChar);
        System.out.println(len);
        //System.out.println(words[1]);

        /*_07_StarngeString answer = new _07_StarngeString();
        String[] result = answer.change(words);*/

        //System.out.println(Arrays.toString(words));

    }
}
