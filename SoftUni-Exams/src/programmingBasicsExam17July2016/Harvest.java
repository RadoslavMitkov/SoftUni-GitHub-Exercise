package programmingBasicsExam17July2016;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kvmLoze = Integer.parseInt(scanner.nextLine());
        double grozdeZa1kvm = Double.parseDouble(scanner.nextLine());
        int neededWineInLitre = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        double allGrozde = kvmLoze * grozdeZa1kvm;
        double wine = 0.4 * allGrozde / 2.5;

        if (wine >= neededWineInLitre) {
            wine = Math.floor(wine);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
            double litresLeft = Math.ceil(wine - neededWineInLitre);
            double literPerPerson = Math.ceil(litresLeft / workersCount);
            System.out.printf("%.0f liters left -> %.0f liters per person.", litresLeft, literPerPerson);
        } else {
            double leftover = Math.floor(neededWineInLitre - wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", leftover);
        }
    }
}
