package Chap_02_String;

import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class _10_RepeatBinary {

    public int[] solution(String str){

        //System.out.println("## In solution ##");

        int turn =0; //변환 횟수
        int cnt = 0 ; //지울 0의 갯수
        StringBuilder sb = new StringBuilder(); //0을 제거한 문자열

        while (!str.equals("1")){ //str이 1이 되면 루프 탈출

            //System.out.println("turn : " + turn );

            for (int i = 0; i<str.length(); i++){

                //System.out.println("## In for ##" );
                //System.out.println("Str : " + str);
                //System.out.println("Sb : " + sb);


                char c = str.charAt(i); //하나씩 검사해서

                if (c!='0'){ //0이 아니면 sb에 저장
                    sb.append(c);
                }else{
                    cnt++; // 0이면 0 count
                }
            }

            int temp = sb.length();
            str = Integer.toBinaryString(temp); //str은 0을 제거한 sb의 길이
            sb.setLength(0); //sb초기화
            turn ++; //변환횟수 1증가

        }

        int[] temp = new int[]{turn,cnt};
        return temp; //변환 횟수와 제거한 0갯수 반환

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _10_RepeatBinary solution = new _10_RepeatBinary();
        int[] result = solution.solution(str);
        System.out.println(Arrays.toString(result));

    }

}
