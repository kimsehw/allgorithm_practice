package 문자열_배열.algo_7회문문자열;

import java.util.Scanner;

public class Main {
    private static void solution(String input) {
        String str = input.toUpperCase();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) {
                System.out.println("NO");
                return;
            }
            lt++;
            rt--;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution(input);
    }
}
