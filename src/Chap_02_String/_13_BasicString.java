package Chap_02_String;

import java.util.Scanner;

public class _13_BasicString {

    public boolean result(String str){

        boolean TF = false;
        int length = str.length();

        if (length != 4 && length !=6 ){ //4도 아니고 6도 아니면 바로 false
            return TF ;
        }
        else{

            for (char c : str.toCharArray()){ //숫자가 아니면 false return
                if(!Character.isDigit(c)) {
                    return TF;
                }
            }

            return TF = true;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _13_BasicString solution = new _13_BasicString();
        boolean TF = solution.result(str);

        System.out.println(TF);



    }
}
