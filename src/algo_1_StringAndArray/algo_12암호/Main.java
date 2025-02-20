package algo_1_StringAndArray.algo_12암호;

import java.util.Scanner;

public class Main {

    private static void solution(int cnt, String str) {
        str = str.replace("#", "1");
        str = str.replace("*", "0");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < cnt * 7; i += 7) {
            String substring = str.substring(i, i + 7);
            int code = 0;
            for (int j = 0; j < 7; j++) {
                code += Integer.parseInt(
                        String.valueOf(substring.charAt(substring.length() - 1 - j))
                ) * (int) (Math.pow(2, j));
            }
            // int code == Integer.parseInt(substring,2) 있네 샹
            char word = (char) code;
            answer.append(word);
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.next());
        String str = sc.next();
        solution(cnt, str);
    }
}
