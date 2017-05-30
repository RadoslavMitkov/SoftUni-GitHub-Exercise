package programmingBasicsMyEntryExam7May2017;

import java.util.Scanner;

public class NumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int specialNumber = Integer.parseInt(scanner.nextLine());
        int controlNumber = Integer.parseInt(scanner.nextLine());

        int number = 0;

        for (int i = m; i >= 1; i--) {

            for (int j = n; j >= 1; j--) {

                for (int k = l; k >= 1; k--) {

                    number = i * 100 + j * 10 + k;

                    if (number % 3 == 0) {
                        specialNumber += 5;

                    } else if (number % 10 == 5) {
                        specialNumber -= 2;

                    } else if (number % 2 == 0) {
                        specialNumber *= 2;
                    }

                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                        return;
                    }

                    if (number == 111) {
                        System.out.printf("No! %d is the last reached special number.", specialNumber);
                        return;
                    }
                }
            }
        }
    }
}
