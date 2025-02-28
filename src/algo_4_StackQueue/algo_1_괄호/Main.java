package algo_4_StackQueue.algo_1_괄호;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static final char OPEN = '(';
    public static final char CLOSE = ')';

    private static void solution(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == OPEN) {
                //stack.add(c);
                stack.push(c);
            }
            if (c == CLOSE) {
                try {
                    stack.pop();
                } catch (EmptyStackException e) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
