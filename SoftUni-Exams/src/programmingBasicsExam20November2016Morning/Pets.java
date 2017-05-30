package programmingBasicsExam20November2016Morning;

import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double perDayDogFoodKg = Double.parseDouble(scanner.nextLine());
        double perDayCatFoodKg = Double.parseDouble(scanner.nextLine());
        double perDayTurtleFoodGr = Double.parseDouble(scanner.nextLine());

        double dogFoodNeeded = days * perDayDogFoodKg;
        double catFoodNeeded = days * perDayCatFoodKg;
        double turtleFoodNeeded = days * perDayTurtleFoodGr / 1000;
        double allFood = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;
        double leftover = Math.abs(foodLeft - allFood);

        if (foodLeft >= allFood) {
            leftover = Math.floor(leftover);
            System.out.printf("%.0f kilos of food left.", leftover);
        } else {
            leftover = Math.ceil(leftover);
            System.out.printf("%.0f more kilos of food are needed.", leftover);
        }
    }
}
