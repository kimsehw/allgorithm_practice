package algo_1_StringAndArray.algo_7회문문자열.algot_8펠린드롬;

import java.util.Scanner;

public class Main {

    private static void solution(String str) {
        str = str.replaceAll("[^a-zA-z]", "");
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Main.solution(str);
    }
}
