package algo_1_StringAndArray.algo2;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        /*char[] output = str.toCharArray();

        for (int i = 0 ; i<output.length ; i++){

            if (Character.isUpperCase(output[i])) output[i] = Character.toLowerCase(output[i]);
            else output[i] = Character.toUpperCase(output[i]);
        }

        return new String(output) ;*/

        String output = "";

        for (char x : str.toCharArray()) {

            if (Character.isUpperCase(x)) {
                output += Character.toLowerCase(x);
            } else {
                output += Character.toUpperCase(x);
            }
        }

        return output;


    }

    public static void main(String[] args) {

        Main M = new Main();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(M.solution(input));

    }
}
