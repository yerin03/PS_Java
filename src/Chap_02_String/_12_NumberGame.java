package Chap_02_String;

import java.util.Scanner;

public class _12_NumberGame {

    public String change(String str){

        //replace를..10개 써야하나 ?
        String temp = str;

        temp = temp.replace("one","1");
        temp = temp.replace("two","2");
        temp = temp.replace("three","3");
        temp = temp.replace("four","4");
        temp = temp.replace("five","5");
        temp = temp.replace("six","6");
        temp = temp.replace("seven","7");
        temp = temp.replace("eigth","8");
        temp = temp.replace("nine","9");
        temp = temp.replace("zero","0");

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        _12_NumberGame solution = new _12_NumberGame();
        String result = solution.change(str);

        System.out.println(result);

    }

}
