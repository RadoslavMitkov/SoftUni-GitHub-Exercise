package programmingBasicsExam18March2017;

import java.util.Scanner;

public class WorkHouse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int hours = workersCount * workDays * 8;
        int timeLeft = Math.abs(hours - neededHours);
        int forfeit = timeLeft * workDays;

        if (neededHours < hours) {
            System.out.printf("%d hours left", timeLeft);
        } else {
            System.out.printf("%d overtime%nPenalties: %d", timeLeft, forfeit);
        }
    }
}
