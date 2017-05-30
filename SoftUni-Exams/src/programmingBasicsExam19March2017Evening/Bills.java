package programmingBasicsExam19March2017Evening;

import java.util.Scanner;

public class Bills {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        double electricity = 0;
        double otherSum = 0;

        for (int i = 0; i < month; i++) {

            double electricityForMonth = Double.parseDouble(scanner.nextLine());
            electricity += electricityForMonth;
            double other = (35 + electricityForMonth); // * 1.2
            double otherPercent = other * 0.2;         //
            otherSum += other + otherPercent;          //
        }

        double water = month * 20;
        double internet =  month * 15;
        double averagePerMonth = (electricity + water + internet + otherSum) / month;

        System.out.printf("Electricity: %.2f lv%n", electricity);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", otherSum);
        System.out.printf("Average: %.2f lv", averagePerMonth);
    }
}
