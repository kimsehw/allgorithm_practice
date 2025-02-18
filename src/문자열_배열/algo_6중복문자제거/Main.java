package 문자열_배열.algo_6중복문자제거;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static void solution(String input) {
        Set<Character> characters = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        Character[] array = characters.toArray(new Character[0]);
        for (Character c : array) {
            System.out.print(c);
        }
    }

    private static void solution2(String input) {
        Set<Character> characters = new HashSet<>();
        ArrayList<Character> answer = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (characters.add(c)) {
                answer.add(c);
            }
        }
        for (Character c : answer) {
            System.out.print(c);
        }
    }

    /**
     * 중요 -> 인덱스 활용 , String 활용
     *
     * @param input
     */
    private static void solution3(String input) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char nowChar = input.charAt(i);
            int firstIndex = input.indexOf(nowChar);
            if (firstIndex == i) {
                answer.append(nowChar);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Main.solution3(input);
    }
}