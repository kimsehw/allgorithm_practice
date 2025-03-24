package algo_5_sorting_searching.algo_7_좌표정렬;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static void solution(int n, Scanner sc) {
        ArrayList<Coord> coords = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coords.add(new Coord(sc.nextInt(), sc.nextInt()));
        }
        coords.sort(Coord::compareTo);
        for (Coord coord : coords) {
            System.out.println(coord.toString());
        }
    }

    private static void solution2(int n, Scanner sc) {
        PriorityQueue<Coord> coords = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            coords.add(new Coord(sc.nextInt(), sc.nextInt()));
        }
        /*for (Coord coord : coords) {
            System.out.println(coord.toString());
        } 힙 구조이기 때문에 단순 순회할 경우 정렬된 결과가 아닌 단순 힙의 순회 결과가 나오게 된다*/
        while (!coords.isEmpty()) {
            System.out.println(coords.poll().toString());
        }
    }

    private static void solution3(int n, Scanner sc) {
        Coord[] coords = new Coord[n];
        for (int i = 0; i < n; i++) {
            coords[i] = new Coord(sc.nextInt(), sc.nextInt());
        }

        for (int i = 1; i < coords.length; i++) {
            Coord insert = coords[i];
            int insertIdx = i;
            for (int j = i - 1; j >= 0; j--) {
                if (coords[j].compareTo(insert) < 1) {
                    break;
                }
                coords[j + 1] = coords[j];
                insertIdx = j;
            }
            coords[insertIdx] = insert;
        }

        for (Coord coord : coords) {
            System.out.println(coord.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution3(n, sc);
    }

    static class Coord implements Comparable<Coord> {
        private int x;
        private int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.valueOf(x + " " + y);
        }

        @Override
        public int compareTo(Coord o) {
            if (this.x > o.x) {
                return 1;
            }
            if (this.x < o.x) {
                return -1;
            }
            if (this.y > o.y) {
                return 1;
            }
            if (this.y < o.y) {
                return -1;
            }
            return 0;
        }
    }
}
