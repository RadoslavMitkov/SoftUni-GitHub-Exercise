package programmingBasicsExam20November2016Morning;

import java.util.Scanner;

public class Fox {

    private static String newString(String sym, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(sym);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // 2 * n + 3

        // top part
        int stars = 1;
        int dashes = (2 * n + 3) - 4;

        for (int i = 0; i < n; i++) {

            System.out.printf("%s\\%s/%s%n",
                    newString("*", stars),
                    newString("-", dashes),
                    newString("*", stars));

            stars++;
            dashes -= 2;
        }

        // mid part
        int sideStars = (n - 1) / 2;
        int midStars = n;

        for (int i = 0; i < n / 3; i++) {

            System.out.printf("|%s\\%s/%s|%n",
                    newString("*", sideStars),
                    newString("*", midStars),
                    newString("*", sideStars));

            sideStars++;
            midStars -= 2;
        }

        // bot part
        dashes += 2;
        stars = (2 * n + 3) - 4;

        for (int i = 0; i < n; i++) {

            System.out.printf("%s\\%s/%s%n",
                    newString("-", dashes),
                    newString("*", stars),
                    newString("-", dashes));

            dashes++;
            stars -= 2;
        }
    }
}
