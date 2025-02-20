package algo_1_StringAndArray.algo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void solution(List<String> words) {
        words.stream()
                .map(word -> new StringBuffer(word).reverse().toString())
                .toList()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main.solution(Main.getWords(sc));
    }

    public static List<String> getWords(Scanner sc) {
        int N = Integer.parseInt(sc.nextLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            words.add(sc.nextLine());
        }
        return words;
    }
}

