package programmingBasicsExam20November2016Morning;

import java.util.Scanner;

public class SofTuniCamp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());
        double sumPeople = 0;

        int carCounter = 0;
        int busCounter = 0;
        int smallAutobusCounter = 0;
        int bigAutobusCounter = 0;
        int trainCounter = 0;

        for (int i = 0; i < groupsCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            if (peopleCount <= 5) {
                carCounter += peopleCount;

            } else if (peopleCount <= 12) {
                busCounter += peopleCount;

            } else if (peopleCount <= 25) {
                smallAutobusCounter += peopleCount;

            } else if (peopleCount <= 40) {
                bigAutobusCounter += peopleCount;

            } else {
                trainCounter += peopleCount;
            }

            sumPeople += peopleCount;
        }

        double carPercent = carCounter / sumPeople * 100;
        double busPercent = busCounter / sumPeople * 100;
        double smallAutobusPercent = smallAutobusCounter / sumPeople * 100;
        double bigAutobusPercent = bigAutobusCounter / sumPeople * 100;
        double trainPercent = trainCounter / sumPeople * 100;

        System.out.printf("%.2f%%%n", carPercent);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", smallAutobusPercent);
        System.out.printf("%.2f%%%n", bigAutobusPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
