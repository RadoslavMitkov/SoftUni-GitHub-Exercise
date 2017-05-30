package programmingBasicsExam19March2017Evening;

import java.util.Scanner;

public class GrapeAndRakija {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double wineyardArea = Double.parseDouble(scanner.nextLine());
        double kgPerMeter = Double.parseDouble(scanner.nextLine());
        double loss = Double.parseDouble(scanner.nextLine());

        double grapePrice = wineyardArea * kgPerMeter - loss;
        double forRakija = 0.45 * grapePrice;
        double rakijaLitres = forRakija / 7.5;
        double rakijaIncome = rakijaLitres * 9.8;
        double grapeForSale = 0.55 * grapePrice;
        double grapeIncome = grapeForSale * 1.5;

        System.out.printf("%.2f%n%.2f", rakijaIncome, grapeIncome);
    }
}
