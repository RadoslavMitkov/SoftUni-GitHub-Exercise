package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class FootballLeague {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Integer.parseInt(scanner.nextLine());
        double allPeople = Integer.parseInt(scanner.nextLine());

        double aCounter = 0;
        double bCounter = 0;
        double vCounter = 0;
        double gCounter = 0;

        for (int i = 0; i < allPeople; i++) {
            String sector = scanner.nextLine();

            switch (sector) {

                case "A":
                    aCounter++;
                    break;

                case "B":
                    bCounter++;
                    break;

                case "V":
                    vCounter++;
                    break;

                case "G":
                    gCounter++;
                    break;
            }
        }

        double aSectorPercent = aCounter / allPeople * 100;
        double bSectorPercent = bCounter / allPeople * 100;
        double vSectorPercent = vCounter / allPeople * 100;
        double gSectorPercent = gCounter / allPeople * 100;
        double allPeoplePercent = allPeople / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", aSectorPercent);
        System.out.printf("%.2f%%%n", bSectorPercent);
        System.out.printf("%.2f%%%n", vSectorPercent);
        System.out.printf("%.2f%%%n", gSectorPercent);
        System.out.printf("%.2f%%%n", allPeoplePercent);
    }
}
