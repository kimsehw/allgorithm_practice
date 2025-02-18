package 문자열_배열.algo_5특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public static void solution(String input) {
        String regex = "[^a-zA-Z]";
        char[] charArray = input.toCharArray();
        int lt = 0;
        int rt = charArray.length - 1;

        while (lt < rt) {
            if (!(isNotAlphabet(regex, charArray[rt]) | isNotAlphabet(regex, charArray[lt]))) {
                swap(charArray, lt, rt);
                lt++;
                rt--;
            }
            if (isNotAlphabet(regex, charArray[rt])) {
                rt--;
            }
            if (isNotAlphabet(regex, charArray[lt])) {
                lt++;
            }
        }
        System.out.println(String.valueOf(charArray));
    }

    private static boolean isNotAlphabet(String regex, char target) {
        // !Character.isAlphabetic(target);
        return String.valueOf(target).matches(regex);
    }

    private static void swap(char[] charArray, int lt, int rt) {
        char temp = charArray[lt];
        charArray[lt] = charArray[rt];
        charArray[rt] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Main.solution(input);
    }
}
