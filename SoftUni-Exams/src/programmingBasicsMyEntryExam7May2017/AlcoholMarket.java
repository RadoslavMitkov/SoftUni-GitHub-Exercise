package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class AlcoholMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLiters = Double.parseDouble(scanner.nextLine());
        double wineLiters = Double.parseDouble(scanner.nextLine());
        double rakijaLiters = Double.parseDouble(scanner.nextLine());
        double wiskeyLiters = Double.parseDouble(scanner.nextLine());

        double rakijaPrie = wiskeyPrice / 2;
        double winePrice = rakijaPrie - rakijaPrie * 0.4;
        double beerPrice = rakijaPrie - rakijaPrie * 0.8;

        double rakijaSum = rakijaPrie * rakijaLiters;
        double wineSum = winePrice * wineLiters;
        double beerSum = beerPrice * beerLiters;
        double wiskeySum = wiskeyPrice * wiskeyLiters;

        double sum = rakijaSum + wineSum + beerSum + wiskeySum;

        System.out.printf("%.2f", sum);
    }
}
