package programmingBasicsExam20November2016Evening;

import java.util.Scanner;

public class Logistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int load = Integer.parseInt(scanner.nextLine());

        double sumLoad = 0;
        double busTons = 0;
        double truckTons = 0;
        double trainTons = 0;

        for (int i = 0; i < load; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            sumLoad += tons;

            if (tons < 4) {
                busTons += tons;

            } else if (tons < 12) {
                truckTons += tons;

            } else {
                trainTons += tons;
            }
        }

        double average = (busTons * 200.0 + truckTons * 175.0 + trainTons * 120.0) / sumLoad;
        double busPercent = busTons / sumLoad * 100;
        double truckPercent = truckTons / sumLoad * 100;
        double trainPercent = trainTons / sumLoad * 100;

        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", busPercent);
        System.out.printf("%.2f%%%n", truckPercent);
        System.out.printf("%.2f%%%n", trainPercent);
    }
}
