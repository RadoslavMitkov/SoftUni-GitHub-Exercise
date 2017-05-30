package programmingBasicsExam20November2016Evening;

import java.util.Scanner;

public class MaxCombination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = n; i <= m; i++) {

            for (int j = n; j <= m; j++) {

                if (counter == max) {
                    return;
                }

                counter++;

                System.out.printf("<%d-%d>", i, j);

            }
        }
    }
}
