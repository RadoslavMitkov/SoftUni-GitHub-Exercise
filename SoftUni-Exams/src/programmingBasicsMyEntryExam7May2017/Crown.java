package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class Crown {

    private static String newString(String s, int c) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < c; i++) {
            builder.append(s);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // first row
        int spaces = (((2 * n) - 1) - 3) / 2;

        System.out.printf("@%s@%s@%n",
                newString(" ", spaces),
                newString(" ", spaces));

        // second row
        spaces--;

        System.out.printf("**%s*%s**%n",
                newString(" ", spaces),
                newString(" ", spaces));

        // first part
        spaces -= 2;
        int lRDots = 1;
        int midDots = 1;

        for (int i = 0; i < (n / 2) - 2; i++) {

            System.out.printf("*%s*%s*%s*%s*%s*%n",
                    newString(".", lRDots),
                    newString(" ", spaces),
                    newString(".", midDots),
                    newString(" ", spaces),
                    newString(".", lRDots));

            spaces -= 2;
            lRDots++;
            midDots += 2;
        }

        // first mid row
        System.out.printf("*%s*%s*%s*%n",
                newString(".", lRDots),
                newString(".", midDots),
                newString(".", lRDots));

        // second mid row
        lRDots++;

        int stars = (((2 * n) - 1) - (lRDots * 2) - 3) / 2;

        System.out.printf("*%s%s.%s%s*%n",
                newString(".", lRDots),
                newString("*", stars),
                newString("*", stars),
                newString(".", lRDots));

        // last rows
        System.out.printf("%s%n", newString("*", (2 * n) - 1));
        System.out.printf("%s%n", newString("*", (2 * n) - 1));
    }
}
