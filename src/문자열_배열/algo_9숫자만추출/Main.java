package 문자열_배열.algo_9숫자만추출;

import java.util.Scanner;

public class Main {

    private static void solution(String input) {
        String onlyNum = input.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(onlyNum));

        StringBuilder answer = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }
        }
    }

    private static void solution2(String input) {
        // 아스키 넘버
        int answer = 0;
        for (char c : input.toCharArray()) {
            if (c <= 57 && c >= 48) {
                answer = answer * 10 + (c - 48);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        solution2(input);
    }
}
