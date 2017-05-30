package programmingBasicsExam19March2017Evening;

import java.util.Scanner;

public class TruckDriver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());

        double payment = 0;
        double result = 0;

        if (kmPerMonth <= 5000) {

            switch (season) {

                case "Summer":
                    payment = kmPerMonth * 0.9 * 4;
                    result = payment - 0.1 * payment;
                    break;
                case "Winter":
                    payment = kmPerMonth * 1.05 * 4;
                    result = payment - 0.1 * payment;
                    break;
                case "Spring":
                case "Autumn":
                    payment = kmPerMonth * 0.75 * 4;
                    result = payment - 0.1 * payment;
                    break;
            }

        } else if (kmPerMonth <= 10000) {

            switch (season) {

                case "Summer":
                    payment = kmPerMonth * 1.1 * 4;
                    result = payment - 0.1 * payment;
                    break;
                case "Winter":
                    payment = kmPerMonth * 1.25 * 4;
                    result = payment - 0.1 * payment;
                    break;
                case "Spring":
                case "Autumn":
                    payment = kmPerMonth * 0.95 * 4;
                    result = payment - 0.1 * payment;
                    break;
            }

        } else if (kmPerMonth <= 20000) {

            payment = kmPerMonth * 1.45 * 4;
            result = payment - 0.1 * payment;
        }

        System.out.printf("%.2f", result);
    }
}
