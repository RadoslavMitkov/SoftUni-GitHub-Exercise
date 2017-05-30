package programmingBasicsExam20November2016Morning;

import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldPeopleCount = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        String transportType = scanner.nextLine();

        double oldies = 0;
        double studens = 0;
        int peopleCount = oldPeopleCount + studentCount;

        switch (transportType) {

            case "train":
                oldies = oldPeopleCount * 24.99;
                studens = studentCount * 14.99;

                if (peopleCount >= 50) {
                    oldies /= 2;
                    studens /= 2;
                }

                break;

            case "bus":
                oldies = oldPeopleCount * 32.5;
                studens = studentCount * 28.5;
                break;

            case "boat":
                oldies = oldPeopleCount * 42.99;
                studens = studentCount * 39.99;
                break;

            case "airplane":
                oldies = oldPeopleCount * 70.0;
                studens = studentCount * 50.0;
                break;

        }

        double moneyForTrip = (oldies + studens) * 2;
        double hotel = nightsCount * 82.99;
        double commission = (moneyForTrip + hotel) * 0.1;
        double sum = moneyForTrip + hotel + commission;

        System.out.printf("%.2f", sum);
    }
}
