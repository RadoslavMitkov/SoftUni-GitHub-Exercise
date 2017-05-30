package programmingBasicsExam17July2016;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double transport = 0;
        double ticketsPrice = 0;
        double leftover = 0;

        if (peopleCount < 5) {
            transport = 0.75 * budget;

        } else if (peopleCount < 10) {
            transport = 0.6 * budget;

        } else if (peopleCount < 25) {
            transport = 0.5 * budget;

        } else if (peopleCount < 50) {
            transport = 0.4 * budget;

        } else {
            transport = 0.25 * budget;
        }

        double moneyLeft = budget - transport;

        if (category.equals("Normal")) {
            ticketsPrice = 249.99 * peopleCount;

        } else if (category.equals("VIP")) {
            ticketsPrice = 499.99 * peopleCount;
        }

        if (ticketsPrice <= moneyLeft) {
            leftover = moneyLeft - ticketsPrice;
            System.out.printf("Yes! You have %.02f leva left.", leftover);

        } else {
            leftover = ticketsPrice - moneyLeft;
            System.out.printf("Not enough money! You need %.02f leva.", leftover);
        }
    }
}
