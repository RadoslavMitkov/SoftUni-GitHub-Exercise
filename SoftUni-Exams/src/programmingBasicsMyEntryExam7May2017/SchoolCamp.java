package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class SchoolCamp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String sexOrMixed = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        String sport = "";
        double nightsPrice = 0;

        switch (season) {

            case "Winter":

                if (sexOrMixed.equals("boys")) {
                    nightsPrice = studentsCount * nightsCount * 9.6;
                    sport = "Judo";
                }

                if (sexOrMixed.equals("girls")) {
                    nightsPrice = studentsCount * nightsCount * 9.6;
                    sport = "Gymnastics";
                }

                if (sexOrMixed.equals("mixed")) {
                    nightsPrice = studentsCount * nightsCount * 10.0;
                    sport = "Ski";
                }

                break;

            case "Spring":

                if (sexOrMixed.equals("boys")) {
                    nightsPrice = studentsCount * nightsCount * 7.2;
                    sport = "Tennis";
                }

                if (sexOrMixed.equals("girls")) {
                    nightsPrice = studentsCount * nightsCount * 7.2;
                    sport = "Athletics";
                }

                if (sexOrMixed.equals("mixed")) {
                    nightsPrice = studentsCount * nightsCount * 9.5;
                    sport = "Cycling";
                }

                break;

            case "Summer":

                if (sexOrMixed.equals("boys")) {
                    nightsPrice = studentsCount * nightsCount * 15.0;
                    sport = "Football";
                }

                if (sexOrMixed.equals("girls")) {
                    nightsPrice = studentsCount * nightsCount * 15.0;
                    sport = "Volleyball";
                }

                if (sexOrMixed.equals("mixed")) {
                    nightsPrice = studentsCount * nightsCount * 20.0;
                    sport = "Swimming";
                }

                break;

        }

        if (studentsCount >= 50) {
            nightsPrice -= nightsPrice * 0.5;

        } else if (studentsCount >= 20) {
            nightsPrice -= nightsPrice * 0.15;

        } else if (studentsCount >= 10) {
            nightsPrice -= nightsPrice * 0.05;
        }

        System.out.printf("%s %.2f lv.", sport, nightsPrice);
    }
}
