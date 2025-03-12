package algo_4_StackQueue.algo_8_응급실;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static void solution(PriorityQueue<Patient> patients, int m) {
        // 문제와 맞지 않음 동시에 우선순위 큐에 들어가는 순서는 섞일 수 있음 비교값이 같을 경우에
        int ans = 1;
        while (!patients.isEmpty()) {
            Patient remove = patients.remove();
            System.out.println("remove = " + remove.toString());
            if (remove.num == m) {
                System.out.println(ans);
            }
            ans++;
        }
    }

    private static void solution(Queue<Patient> patients, int m) {
        int ans = 1;
        while (true) {
            Patient poll = patients.poll();
            boolean can = true;
            for (Patient patient : patients) {
                if (patient.danger > poll.danger) {
                    patients.add(poll);
                    can = false;
                    break;
                }
            }
            if (can) {
                if (poll.num == m) {
                    System.out.println(ans);
                    return;
                }
                ans++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //PriorityQueue<Patient> patients = new PriorityQueue<>();
        Queue<Patient> patients = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            patients.add(new Patient(i, sc.nextInt()));
        }
        solution(patients, m);
    }

    static class Patient implements Comparable<Patient> {
        public int num;
        public int danger;

        public Patient(int num, int danger) {
            this.num = num;
            this.danger = danger;
        }

        @Override
        public int compareTo(Patient patient) {
            if (this.danger > patient.danger) {
                return -1;
            }
            if (this.danger < patient.danger) {
                return 1;
            }
            return Integer.compare(this.num, patient.num);
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "num=" + num +
                    ", danger=" + danger +
                    '}';
        }
    }
}
