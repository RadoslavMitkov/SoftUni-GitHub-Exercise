package programmingBasicsExam20November2016Evening;

import java.util.Scanner;

public class Rocket {

    private static String newString(String s, int n) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append(s);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // (3 * n) - width
        // top part
        int spaces = 0;
        int dots = ((3 * n) - spaces - 2) / 2;

        for (int i = 0; i < n; i++) {

            System.out.printf("%s/%s\\%s%n",
                    newString(".", dots),
                    newString(" ", spaces),
                    newString(".", dots));

            dots -= 1;
            spaces += 2;
        }

        // mid row
        dots++;
        int stars = n * 2;

        System.out.printf("%s%s%s%n",
                newString(".", dots),
                newString("*", stars),
                newString(".", dots));

        // rocket body
        int slashes = (n * 2) - 2;

        for (int i = 0; i < n * 2; i++) {

            System.out.printf("%s|%s|%s%n",
                    newString(".", dots),
                    newString("\\", slashes),
                    newString(".", dots));
        }

        // flames
        stars -= 2;

        for (int i = 0; i < n / 2; i++) {

            System.out.printf("%s/%s\\%s%n",
                    newString(".", dots),
                    newString("*", stars),
                    newString(".", dots));

            stars += 2;
            dots--;
        }
    }
}
