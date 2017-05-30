package programmingBasicsExam19March2017Evening;

import java.util.Scanner;

public class Styrofoam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double houseArea = Double.parseDouble(scanner.nextLine());
        double windowsCount = Double.parseDouble(scanner.nextLine());
        double styrofoamInOnePackage = Double.parseDouble(scanner.nextLine());
        double packagePrice = Double.parseDouble(scanner.nextLine());

        double area = houseArea - windowsCount * 2.4;
        area += 0.1 * area;
        double neededPackages = Math.ceil(area / styrofoamInOnePackage);
        double packagesPrice = neededPackages * packagePrice;
        double money = Math.abs(budget - packagesPrice);

        if (budget >= packagesPrice) {
            System.out.printf("Spent: %.2f%nLeft: %.2f", packagesPrice, money);
        } else {
            System.out.printf("Need more: %.2f", money);
        }
    }
}
