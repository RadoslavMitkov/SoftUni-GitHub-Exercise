package programmingBasicsExam19March2017Morning;

import java.util.Scanner;

public class Cups {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cupsNeeded = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int hours = workersCount * workDays * 8;
        int cups = hours / 5;
        double loss = Math.abs(cupsNeeded - cups);
        double result = loss * 4.2;

        if (cupsNeeded > cups) {
            System.out.printf("Losses: %.2f", result);
        } else {
            System.out.printf("%.2f extra money", result);
        }
    }
}
