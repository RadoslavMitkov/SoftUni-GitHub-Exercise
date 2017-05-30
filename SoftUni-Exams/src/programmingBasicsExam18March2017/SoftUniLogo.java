package programmingBasicsExam18March2017;

import java.util.Scanner;

public class SoftUniLogo {

    private static String newString(String symbol, int counter) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < counter; i++) {
            builder.append(symbol);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // 4 * n - 2 rows
        // 12 * n - 5 columns

        // first row
        int firstRowDots = ((12 * n - 5) - 1) / 2;

        System.out.printf("%s#%s%n",
                newString(".", firstRowDots),
                newString(".", firstRowDots));

        // top
        int hashes = 7;
        int dots = ((12 * n - 5) - hashes) / 2;

        for (int i = 0; i < n * 2 - 1; i++) {
            System.out.printf("%s%s%s%n",
                    newString(".", dots),
                    newString("#", hashes),
                    newString(".", dots));

            hashes += 6;
            dots -= 3;
        }

        // falling bottom part
        int leftFallingDots = 2;
        int rightFallingDots = 3;
        hashes -= 12;

        for (int i = 0; i < n - 2; i++) {
            System.out.printf("|%s%s%s%n",
                    newString(".", leftFallingDots),
                    newString("#", hashes),
                    newString(".", rightFallingDots));

            leftFallingDots += 3;
            rightFallingDots += 3;
            hashes -= 6;
        }

        // straight bottom part
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("|%s%s%s%n",
                    newString(".", leftFallingDots),
                    newString("#", hashes),
                    newString(".", rightFallingDots));
        }

        // last row
        System.out.printf("@%s%s%s%n",
                newString(".", leftFallingDots),
                newString("#", hashes),
                newString(".", rightFallingDots));
    }
}
