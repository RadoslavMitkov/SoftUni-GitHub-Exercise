package programmingBasicsExam17July2016;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        int bitcoinInLv = bitcoin * 1168;
        double yuanToDollar = yuan * 0.15;
        double dollarToLeva = yuanToDollar * 1.76;
        double euro = (bitcoinInLv + dollarToLeva) / 1.95;
        double result = (commision / 100) * euro;
        result = euro - result;
        System.out.println("result = " + result);
    }
}
