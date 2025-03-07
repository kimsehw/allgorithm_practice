package algo_4_StackQueue.algo_4_후위식연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static void solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            try {
                int num = Integer.parseInt(String.valueOf(c));
                stack.push(num);
            } catch (NumberFormatException e) {
                stack.push(calculation(c, stack.pop(), stack.pop()));
            }
        }
        System.out.println(stack.get(0));
    }

    private static int calculation(char c, int rt, int lt) {
        if (c == '+') {
            return lt + rt;
        }
        if (c == '-') {
            return lt - rt;
        }
        if (c == '*') {
            return lt * rt;
        }
        return lt / rt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
