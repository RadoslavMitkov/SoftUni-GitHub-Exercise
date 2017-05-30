package programmingBasicsExam20November2016Morning;

        import java.util.Scanner;

public class Battlers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokemonsCountP1 = Integer.parseInt(scanner.nextLine());
        int pokemonsCountP2 = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 1; i <= pokemonsCountP1; i++) {

            for (int j = 1; j <= pokemonsCountP2; j++) {
                counter++;

                System.out.printf("(%d <-> %d) ", i, j);

                if (counter == maxBattles) {
                    return;
                }
            }
        }
    }
}
