package algo_1_StringAndArray.algo3;

import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String maxLengthWord = "";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char x = str.toCharArray()[i];
            if (x == ' ' || i == str.length() - 1) {
                if (i == str.length() - 1) {
                    temp += x;
                }
                if (maxLengthWord.length() < temp.length()) {
                    maxLengthWord = temp;
                }
                temp = "";
            } else {
                temp += x;
            }
        }
        return maxLengthWord;

        /*
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s){
            if (answer.length() < x.length()){
                answer = x ;
            }
        }
        return answer ;
        */

        /*String answer = "";
        int m = Integer.MIN_VALUE , pos;
        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0,pos);
            str = str.substring(pos + 1);

            if (answer.length() < tmp.length()){
                answer = tmp ;
            }

        }
        if (str.length() > answer.length()) answer = str;
        return answer;*/

    }

    public static void main(String[] args) {

        algo_1_StringAndArray.algo3.Main M = new algo_1_StringAndArray.algo3.Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(M.solution(input));

    }
}
