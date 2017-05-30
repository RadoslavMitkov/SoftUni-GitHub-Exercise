package programmingBasicsExam18March2017;

import java.util.Scanner;

class GameOfIntervals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int step = Integer.parseInt(scanner.nextLine());
        double score = 0;

        double counter09 = 0;
        double counter1019 = 0;
        double counter2029 = 0;
        double counter3039 = 0;
        double counter4050 = 0;
        double counterInvalid = 0;

        for (int i = 0; i < step; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                counter09++;
                score += number * 0.2;

            } else if (number >= 10 && number <= 19) {
                counter1019++;
                score += number * 0.3;

            } else if (number >= 20 && number <= 29) {
                counter2029++;
                score += number * 0.4;

            } else if (number >= 30 && number <= 39) {
                counter3039++;
                score += 50;

            } else if (number >= 40 && number <= 50) {
                counter4050++;
                score += 100;

            } else if (number < 0 || number > 50) {
                counterInvalid++;
                score /= 2;
            }
        }

        double percent09 = counter09 / step * 100;
        double percent1019 = counter1019 / step * 100;
        double percent2029 = counter2029 / step * 100;
        double percent3039 = counter3039 / step * 100;
        double percent4050 = counter4050 / step * 100;
        double percentInvalid = counterInvalid / step * 100;

        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", percent09);
        System.out.printf("From 10 to 19: %.2f%%%n", percent1019);
        System.out.printf("From 20 to 29: %.2f%%%n", percent2029);
        System.out.printf("From 30 to 39: %.2f%%%n", percent3039);
        System.out.printf("From 40 to 50: %.2f%%%n", percent4050);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalid);
    }
}
