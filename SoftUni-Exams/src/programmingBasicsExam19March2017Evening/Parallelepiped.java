package programmingBasicsExam19March2017Evening;

import java.util.Scanner;

public class Parallelepiped {

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

        int waves = n - 2;
        int dots = (3 * n + 1) - (waves + 2);

        // first row
        System.out.printf("+%s+%s%n",
                newString("~", waves),
                newString(".", dots));

        int rows = n * 2 + 1;
        dots = 0;
        int endDots = (3 * n + 1) - (waves + 2) - 1;

        // first part
        for (int i = 0; i < rows; i++) {

            System.out.printf("|%s\\%s\\%s%n",
                    newString(".", dots),
                    newString("~", waves),
                    newString(".", endDots));

            dots++;
            endDots--;
        }


        endDots++;
        dots--;

        // second part
        for (int i = 0; i < rows; i++) {

            System.out.printf("%s\\%s|%s|%n",
                    newString(".", endDots),
                    newString(".", dots),
                    newString("~", waves));

            dots--;
            endDots++;
        }

        // last row
        System.out.printf("%s+%s+%n",
                newString(".", endDots),
                newString("~", waves));
    }
}
