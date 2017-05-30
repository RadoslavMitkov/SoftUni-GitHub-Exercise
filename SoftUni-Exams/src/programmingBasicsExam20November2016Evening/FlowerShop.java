package programmingBasicsExam20November2016Evening;

        import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int ziumbiul = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double sum = magnolia * 3.25 + ziumbiul * 4.0 + rose * 3.5 + cactus * 8.0;
        sum -= sum * 0.05;

        double moneyLeft = Math.abs(presentPrice - sum);

        if (sum < presentPrice) {
            double result = Math.ceil(moneyLeft);

            System.out.printf("She will have to borrow %.0f leva.", result);

        } else {
            double result = Math.floor(moneyLeft);

            System.out.printf("She is left with %.0f leva.", result);

        }
    }
}
