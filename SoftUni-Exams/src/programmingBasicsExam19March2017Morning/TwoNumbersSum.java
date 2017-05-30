package programmingBasicsExam19March2017Morning;

import java.util.Scanner;

public class TwoNumbersSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = n; i >= m; i--) {
            for (int j = n; j >= m; j--) {
                counter++;
                if (i + j == s) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            counter, i, j, s);
                    return;
                }
            }
        }

        System.out.printf("%d combinations - neither equals %d", counter, s);
    }
}
