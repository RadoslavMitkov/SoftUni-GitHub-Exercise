package programmingBasicsExam20November2016Evening;

import java.util.Scanner;

public class BikeRace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();

        int peopleCount = juniorsCount + seniorsCount;
        double tax = 0;

        switch (raceType) {

            case "trail":
                tax = 5.5 * juniorsCount + 7.0 * seniorsCount;
                break;
            case "cross-country":
                tax = 8.0 * juniorsCount + 9.5 * seniorsCount;
                break;
            case "downhill":
                tax = 12.25 * juniorsCount + 13.75 * seniorsCount;
                break;
            case "road":
                tax = 20.0 * juniorsCount + 21.5 * seniorsCount;
                break;
        }

        if (peopleCount >= 50 && raceType.equals("cross-country")) {
            tax -= 0.25 * tax;
        }

        tax -= 0.05 * tax;
        System.out.printf("%.2f", tax);
    }
}
