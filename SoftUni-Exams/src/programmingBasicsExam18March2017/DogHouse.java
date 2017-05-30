package programmingBasicsExam18March2017;

import java.util.Scanner;

public class DogHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double sides = (a * (a / 2)) * 2;
        double backWall = ((a / 2) * (a / 2)) + (((a / 2) * (b - a / 2)) / 2);
        double frontWall = ((a / 2) * (a / 2)) + (((a / 2) * (b - a / 2)) / 2) - ((a / 5) * (a / 5));
        double roof = (a * (a / 2) * 2);
        double green = (sides + backWall + frontWall) / 3;
        double red = roof / 5;

        System.out.printf("%.2f%n", green);
        System.out.printf("%.2f%n", red);
    }
}
