package programmingBasicsExam18March2017;

import java.util.Scanner;

public class CarToGo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classs = "";
        String type = "";
        double price = 0;

        if (budget <= 100) {
            classs = "Economy class";

            if (season.equals("Summer")) {
                type = "Cabrio";
                price = 0.35 * budget;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = 0.65 * budget;
            }

        } else if (budget <= 500) {
            classs = "Compact class";

            if (season.equals("Summer")) {
                type = "Cabrio";
                price = 0.45 * budget;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = 0.80 * budget;
            }

        } else {
            classs = "Luxury class";
            type = "Jeep";
            price = 0.90 * budget;
        }

        System.out.printf("%s%n%s - %.2f", classs, type, price);
    }
}
