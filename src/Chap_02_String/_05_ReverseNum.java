package Chap_02_String;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class _05_ReverseNum {

    //문자열 변환
    //reverse
    //배열로
    //다시 정수로
    public int[] Reverse(long n){

        String str = Long.toString(n); //Long.toString이용하여 문자열로 변환
        String reversed = new StringBuilder(str).reverse().toString(); //reverse
        char[] array = reversed.toCharArray(); //문자배열로 변환

        int[] result = new int[array.length];

        for (int i = 0 ; i <result.length; i++ ){
            result[i] = array[i] - '0'; //문자를 정수로 변환
        }


        return result;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //자연수 입력받기
        long n = scanner.nextLong();

        _05_ReverseNum answer = new _05_ReverseNum();
        int[] result = answer.Reverse(n);

        //System.out.println(result); -> result는 int배열인데 배열의 주소를 나타내는 문자열을  출력해서 오류
        System.out.println(Arrays.toString(result)); //Array.toString()메서드 사용
    }

}
