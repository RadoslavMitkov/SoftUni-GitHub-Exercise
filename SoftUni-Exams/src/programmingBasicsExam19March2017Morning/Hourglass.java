package programmingBasicsExam19March2017Morning;

import java.util.Scanner;

public class Hourglass {

    private static String newString(String symbol, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(symbol);
        }

        return builder.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // first row
        int stars = 2 * n + 1;

        System.out.printf("%s%n", newString("*", stars));

        // second row
        int topSpaces = (2 * n + 1) - 4;

        System.out.printf(".*%s*.%n", newString(" ", topSpaces));

        // top part
        int dots = 2;
        int at = (2 * n + 1) - 6;

        for (int i = 0; i < n - 2; i++) {

            System.out.printf("%s*%s*%s%n",
                    newString(".", dots),
                    newString("@", at),
                    newString(".", dots));

            dots++;
            at -= 2;
        }

        //mid row
        System.out.printf("%s*%s%n",
                newString(".", n),
                newString(".", n));

        // bottom part
        dots--;
        int bottomSpaces = 0;

        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%s*%s@%s*%s%n",
                    newString(".", dots),
                    newString(" ", bottomSpaces),
                    newString(" ", bottomSpaces),
                    newString(".", dots));

            dots--;
            bottomSpaces++;
        }

        // before last row
        at = (2 * n + 1) - 4;
        System.out.printf(".*%s*.%n", newString("@", at));

        // last row
        System.out.printf("%s%n", newString("*", stars));
    }
}
