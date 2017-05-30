package programmingBasicsExam20November2016Morning;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKilos = Double.parseDouble(scanner.nextLine());
        double safridKilos = Double.parseDouble(scanner.nextLine());
        int midiKilos = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriqPrice + skumriqPrice * 0.6;
        double palamud = palamudKilos * palamudPrice;
        double safridPrice = cacaPrice + cacaPrice * 0.8;
        double safrid = safridPrice * safridKilos;
        double midi = midiKilos * 7.5;

        double result = palamud + safrid + midi;

        System.out.printf("%.2f", result);
    }
}
