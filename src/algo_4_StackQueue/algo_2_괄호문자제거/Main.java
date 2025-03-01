package algo_4_StackQueue.algo_2_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static final char OPEN = '(';
    public static final char CLOSE = ')';

    private static void solution(String str) {
        int openCnt = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == CLOSE) {
                while (stack.pop() != OPEN)
                    ;
                continue;
            }
            stack.push(c);
        }

        StringBuilder ans = new StringBuilder();
        for (Character c : stack) {
            ans.append(c);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}