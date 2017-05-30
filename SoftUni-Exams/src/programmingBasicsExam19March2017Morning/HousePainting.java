package programmingBasicsExam19March2017Morning;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double window = (1.5 * 1.5);
        double door = 2 * 1.2;
        double backWall = x * x;
        double frontWall = (x * x) - door;
        double sideWalls = ((x * y) * 2) - (window * 2);

        double greenPaintNeeded = (backWall + frontWall + sideWalls) / 3.4;

        double roofSides = (x * y) * 2;
        double roofFrontAndBack = (x * h / 2) * 2;

        double redPaintNeeded = (roofSides + roofFrontAndBack) / 4.3;

        System.out.printf("%.2f%n", greenPaintNeeded);
        System.out.printf("%.2f%n", redPaintNeeded);
    }
}
