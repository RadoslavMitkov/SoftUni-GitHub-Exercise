package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int talkingDollCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double moneyEarned = puzzleCount * 2.6 + talkingDollCount * 3.0 + teddyBearsCount * 4.1 + minionsCount * 8.2 + trucksCount * 2.0;
        int allToys = puzzleCount+talkingDollCount+teddyBearsCount+minionsCount+trucksCount;

        if (allToys >= 50) {
            moneyEarned -= 0.25 * moneyEarned;
        }

        double rent = moneyEarned * 0.1;
        double profit = moneyEarned - rent;

        if (profit < vacationPrice) {
            double result = Math.abs(profit - vacationPrice);

            System.out.printf("Not enough money! %.2f lv needed.", result);

        } else {
            double result = Math.abs(profit - vacationPrice);

            System.out.printf("Yes! %.2f lv left.", result);
        }
    }
}
