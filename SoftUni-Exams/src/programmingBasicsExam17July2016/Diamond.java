package programmingBasicsExam17July2016;

import java.util.Scanner;

public class Diamond {

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

        int dots = n;
        int stars = (5 * n) - (n * 2);
        int midDots = (5 * n) - ((n - 1) * 2) - 2;

        System.out.printf("%s%s%s%n",
                newString(".", dots),
                newString("*", stars),
                newString(".", dots));

        for (int i = 0; i < n - 1; i++) {
            dots--;
            System.out.printf("%s*%s*%s%n",
                    newString(".", dots),
                    newString(".", midDots),
                    newString(".", dots));
            midDots += 2;
        }

        System.out.println(newString("*", n * 5));

        for (int i = 0; i < n * 2; i++) {
            midDots-=2;
            System.out.printf("%s*%s*%s%n",
                    newString(".", dots),
                    newString(".", midDots),
                    newString(".", dots));
            dots++;
        }

        System.out.printf("%s%s%s",
                newString(".", dots),
                newString("*", midDots),
                newString(".", dots));
    }
}
